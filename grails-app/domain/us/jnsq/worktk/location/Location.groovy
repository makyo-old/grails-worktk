package us.jnsq.worktk.location

class Location {
    Location parent
    Address address
    String name
    String description
    Integer floor
    Double longitude
    Double latitude
    Date dateCreated
    Date lastUpdated

    static constraints = {
    }
}
