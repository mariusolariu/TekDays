package com.tekdays

import grails.test.spock.IntegrationSpec

class TaskServiceIntegrationSpec extends IntegrationSpec {
    def taskService

    def setup() {
        new TekUser(firstName: "Tester").save()
    }

    def cleanup() {
    }

    void "test addToDefaultTasks"() {
        when: "we pass an event to taskService.addDefaultTasks"
        def e = new TekEvent(name: "Test Conferernce", organizer: TekUser.findByFirstName("Tester"))
        taskService.addDefaultTasks(e)

        then: "the event will have 6 default tasks"
        e.tasks.size() == 6
    }
}
