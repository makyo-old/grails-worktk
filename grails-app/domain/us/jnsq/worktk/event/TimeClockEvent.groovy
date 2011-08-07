package us.jnsq.worktk.event

import us.jnsq.worktk.security.User

class TimeClockEvent {
    DateTimeEvent dte
    User owner

    static constraints = {
    }
}
