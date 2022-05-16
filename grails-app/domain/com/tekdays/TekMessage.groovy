package com.tekdays

class TekMessage {
    String subject
    String content
    TekMessage parent
    TekEvent event
    TekUser author

    static belongsTo = TekEvent

    static constraints = {
        parent nullable: true
    }
}
