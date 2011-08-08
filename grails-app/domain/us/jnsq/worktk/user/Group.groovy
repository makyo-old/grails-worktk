package us.jnsq.worktk.user

import us.jnsq.worktk.security.User

class Group {
    User owner
    String name
    String description

    static constraints = {
    }
}
