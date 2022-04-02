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

  @Override
  String toString() {
    return [name, city].join(", ")
  }
}
