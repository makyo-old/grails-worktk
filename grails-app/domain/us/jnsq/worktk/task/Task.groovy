package us.jnsq.worktk.task

import us.jnsq.worktk.event.DateTimeEvent
import us.jnsq.worktk.project.*
import us.jnsq.worktk.security.User
import us.jnsq.worktk.support.KB

class Task {
    User submitter
    User assignee
    Component component
    Release fixByRelease
    Task parent
    Task duplicateOf
    String title
    String description
    String taskType
    String priority
    String status
    Integer agileLane
    String resolution
    DateTimeEvent agileDte
    DateTimeEvent lifespan
    Date lastUpdated
    KB kb
    
    static constraints = {
    }
    
    static hasMany = [
        affectsReleases: Release
    ]
}
