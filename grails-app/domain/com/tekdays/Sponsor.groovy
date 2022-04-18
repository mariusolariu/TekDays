package com.tekdays

class Sponsor {
    String name
    String website
    String description
    byte[] logo

    static hasMany = [
        events: TekEvent,
        sponsorships: Sponsorship
    ]

    // one side of the m-t-m relationship has to be the owning side, no back reference to TekEvent (e.g. a tekEvent field)
    static belongsTo = TekEvent

    static constraints = {
        name blank : false
        website blank : false, url : true
        description nullable : true, maxSize : 5000
        logo nullable : true, maxSize : 4000000
        sponsorships nullable : true
    }

    @Override
    String toString() {
        return name
    }
}
