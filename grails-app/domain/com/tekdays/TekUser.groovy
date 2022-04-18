package com.tekdays

class TekUser {
  String username
  String password
  String firstName
  String lastName
  String email
  String website
  String bio

  @Override
  String toString() {
     "${firstName}"
  }

  static constraints = {
    firstName()
    lastName(nullable: true)
    email(nullable: true)
    website(nullable: true)
    bio(maxSize:5000, nullable:true)
  }

}
