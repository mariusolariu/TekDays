package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

//import spock.lang.*;
//import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class uTekEventSpec extends Specification {

  def setup() {
  }

  def cleanup() {
  }

  /**
   * Comment the code in BootStrap.init() - for some reason the test fails because that method gets executed and data cannot be saved into the inmemory db
   */
  void "test something"() {
    when: "a TekEvent has a name and a city"
      def tekEvent = new TekEvent(name: 'Groovy One', city: 'London',
          organizer: ([firstName: "Marius"] as TekUser))

    then: "the ToString method will combin them"
         tekEvent.toString() == 'Groovy One, London'
  }
}
