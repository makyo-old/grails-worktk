package us.jnsq.worktk.tag

class TaggedItem {
    String itemClass
    Long itemID
    Tag tag

    static constraints = {
    }
    
    static belongsTo = [tag: Tag]
}
