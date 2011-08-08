package us.jnsq.worktk.task

import us.jnsq.worktk.security.User

class TaskAction {
    Task task
    User user
    Date dateCreated
    String action
    String valueFrom // ?
    String valueTo

    static constraints = {
    }
}
