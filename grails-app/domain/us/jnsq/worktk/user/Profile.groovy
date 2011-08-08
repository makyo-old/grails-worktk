package us.jnsq.worktk.user

import us.jnsq.worktk.security.User
import us.jnsq.worktk.location.Address

class Profile {
    User user
    String firstName
    String lastName
    String email
    

    static constraints = {
    }
    
    static hasMany = [
        phoneNumbers: PhoneNumber,
        addresses: Address,
        addressBookPhoneNumbers: PhoneNumber,
        addressBookAddresses: Address
    ]
}
