// File: src/groovy/com/mrhaki/grails/User.groovy
package com.mrhaki.grails.User

@grails.validation.Validateable
class User {
    String username
    String email

    static constraints = {
        // Reference constraint from grails.gorm.default.constraints
        // with shared argument.
        email shared: 'customEmail'
    } 
}
