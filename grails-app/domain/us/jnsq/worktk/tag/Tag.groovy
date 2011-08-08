package us.jnsq.worktk.tag

class Tag {
    String tagName

    static constraints = {
    }
    
    static hasMany = [
        items: TaggedItem
    ]
}
