package us.jnsq.worktk.event

import us.jnsq.worktk.security.User
import us.jnsq.worktk.location.Location

class Event {
    DateTimeEvent dte
    Calendar calendar
    User owner
    Location location
    String title
    String description
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
