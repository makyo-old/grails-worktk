package us.jnsq.worktk.project

class Team {
    String name
    String description
    Employee lead

    static constraints = {
    }
    
    static hasMany = [
        members: Employee
    ]
}
