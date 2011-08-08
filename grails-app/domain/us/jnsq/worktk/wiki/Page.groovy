package us.jnsq.worktk.wiki

import us.jnsq.worktk.security.User

class Page {
    String slug
    String title
    String body
    String changeMessage
    Date dateCreated
    Date lastUpdated
    User creator
    Integer version
    String parentClass
    Long parentID

    static constraints = {
    }
}
