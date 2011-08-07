package us.jnsq.worktk.user

import us.jnsq.worktk.security.User
import us.jnsq.worktk.project.Organization

class Employee {
    User user
    Organization organization
    Boolean isClockedIn
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
