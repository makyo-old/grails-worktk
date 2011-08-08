package us.jnsq.worktk.project

import us.jnsq.worktk.security.User

class Employee {
    User user
    Organization organization
    Boolean isClockedIn
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
