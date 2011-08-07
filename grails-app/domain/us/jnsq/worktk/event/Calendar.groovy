package us.jnsq.worktk.event

import us.jnsq.worktk.security.User

class Calendar {
    User owner
    String slug
    String title
    String description
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
