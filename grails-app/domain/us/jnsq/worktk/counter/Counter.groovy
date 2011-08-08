package us.jnsq.worktk.counter

import us.jnsq.worktk.event.DateTimeEvent
import us.jnsq.worktk.security.User
import us.jnsq.worktk.project.Project

class Counter {
    DateTimeEvent dte
    String title
    User owner
    Project project
    Long count = 0
    
    static constraints = {
    }
}
