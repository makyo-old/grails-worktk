package us.jnsq.worktk.comment

import us.jnsq.worktk.security.User

class Comment {
    String parentClass
    Long parentID
    String title
    String body
    User owner
    Date dateCreated
    Date lastUpdated
    boolean visible

    static constraints = {
    }
}
