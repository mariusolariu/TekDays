import com.tekdays.Sponsor
import com.tekdays.Sponsorship
import com.tekdays.TekEvent
import com.tekdays.TekUser
import grails.util.GrailsUtil

class BootStrap {

//    def init = {
//
//    }

    //called every time the app starts
    def init = {

        // the init closure is called every time we launch the app and we want to insert data into the db just once
        if (!TekEvent.get(1)) {
            def user = new TekUser(firstName: 'Marius',
                lastName: 'Olariu',
                username: 'marius_olariu',
                password: 'test',
                email: 'tes.user@gmail.com',
                bio: 'haha');

            if (!user.save()) throw new RuntimeException('Could not save user')

            TekEvent event = new TekEvent(name: 'Conference 1',
                city: 'London, UK',
                venue: 'O2 arena',
                organizer: user,
                startDate: new Date('02/04/2022'),
                endDate: new Date('08/04/2022'),
                description: '''
                 The coolest event in the country
            ''')

            if (!event.save()) throw new RuntimeException('Could not save event')

            TekEvent retrievedFromDb = TekEvent.findByName("Conference 1")
            retrievedFromDb.addToVolunteers(new TekUser(firstName: 'Liza',
                lastName: 'Olariu',
                username: 'liza_olariu',
                password: 'test',
                email: 'liza.olariu@gmail.com',
                bio: 'haha'))

            retrievedFromDb.addToVolunteers(new TekUser(firstName: 'Aleksa',
                lastName: 'Stefanovic',
                username: 'aleksa',
                password: 'test',
                email: 'aleksa.olariu@gmail.com',
                bio: 'haha'))

            retrievedFromDb.addToRespondentsEmails("ioan@cab.med.ro")
            retrievedFromDb.addToRespondentsEmails("alex@cab.med.ro")
            retrievedFromDb.addToRespondentsEmails("darius@cab.med.ro")

            def s1 = new Sponsor(name: "Ioan Olariu", website: "https://www.google.com").save()
            failedToSaveToDb(s1)
            def s2 = new Sponsor(name: "Gheorghe Olariu", website: "https://www.google.com").save()
            failedToSaveToDb(s2)
            def spon1 = new Sponsorship(event: retrievedFromDb, sponsor: s1, contributionType: "Venue").save()
            failedToSaveToDb(spon1)
            def spon2 = new Sponsorship(event: retrievedFromDb, sponsor: s2, contributionType: "Cash").save()
            failedToSaveToDb(spon2)
            retrievedFromDb.addToSponsors(s1)
            retrievedFromDb.addToSponsors(s2)
            retrievedFromDb.addToSponsorships(spon1)
            retrievedFromDb.addToSponsorships(spon2)

            retrievedFromDb.save(flush: true)
        }
    }

    def failedToSaveToDb(def x) {
        if (!x) throw new RuntimeException("Failed to save to db: $x")
    }

    def destroy = {
    }
}
