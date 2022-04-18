package tekdays

import com.tekdays.Task
import com.tekdays.TekEvent
import grails.transaction.Transactional

@Transactional
class TaskService {

    def serviceMethod() {

    }

    def addDefaultTasks(TekEvent tekEvent) {
        if (tekEvent.tasks?.size() > 0) return; // only want to add tasks to a new event

        tekEvent.addToTasks new Task(title: 'Identify potential venues')
        tekEvent.addToTasks new Task(title: 'Get price/availability of Venues')
        tekEvent.addToTasks new Task(title: 'Compile potential sponsor list')
        tekEvent.addToTasks new Task(title: 'Design promotional materials')
        tekEvent.addToTasks new Task(title: 'Compile potential advertising avenues')
        tekEvent.addToTasks new Task(title: 'Locate swag provider')
        tekEvent.save()
    }
}
