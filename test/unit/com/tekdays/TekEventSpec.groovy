package com.tekdays

import grails.test.mixin.TestFor
import spock.lang.Specification

//import spock.lang.*;
//import grails.test.mixin.TestFor

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(TekEvent)
class TekEventSpec extends Specification {

  def setup() {
  }

  def cleanup() {
  }

  void "test something"() {
    when: "a TekEvent has a name and a city"
      def tekEvent = new TekEvent(name: 'Groovy One', city: 'London')

    then: "the ToString method will combin them"
         tekEvent.toString() == 'Groovy One, London'
  }
}
