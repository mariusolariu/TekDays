import com.tekdays.TekEvent
import com.tekdays.TekUser

class BootStrap {



    //called every time the app starts
    def init = { servletContext ->

        def user = new TekUser(firstName: 'Marius',
            lastName: 'Olariu',
            username: 'marius_olariu',
            password: 'test',
            email: 'tes.user@gmail.com',
            website: 'www.test.com',
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

    }
    def destroy = {
    }
}
