package com.tekdays

class Sponsorship {
    TekEvent event
    Sponsor sponsor
    String description
    String contributionType
    String notes

    def belongsTo = Sponsor

    static constraints = {
        event nullable : false
        sponsor nullable : false
        description nullable : true
        contributionType inList: ["Other", "Venue", "A/V", "Promotion", "Cash"]
        notes nullable : true, maxSize:5000
    }

    @Override
    public String toString() {
        return "Sponsorship{" +
            "event=" + event?.name +
            ", sponsor=" + sponsor?.name +
            ", contributionType='" + contributionType + '\'' +
            '}';
    }
}
