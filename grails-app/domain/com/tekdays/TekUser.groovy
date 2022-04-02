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
     "$firstName $lastName"
  }

  static constraints = {
    firstName()
    lastName()
    email()
    website()
    bio maxSize:5000
  }

}
