package com.tekdays

import groovy.transform.CompileStatic

class TekEvent {
  String city
  String name
  TekUser organizer
  String venue
  Date startDate
  Date endDate
  String description

  static hasMany = [
      volunteers: TekUser,
      respondentsEmails: String,
      sponsors: Sponsor,
      sponsorships: Sponsorship,
      tasks: Task,
      messages: TekMessage
  ]

  @Override
  String toString() {
    return [name, city].join(", ")
  }

  // the order of constraints here will determine the order in the view for columns
  static constraints = {
    name()
    city()
    description maxSize : 5000
    organizer()
    venue()
    startDate()
    endDate()
    sponsors nullable : true
    sponsorships nullable : true
    tasks: nullable : true
    messages: nullable : true
  }
}
