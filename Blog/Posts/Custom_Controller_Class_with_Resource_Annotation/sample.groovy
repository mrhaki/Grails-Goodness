// File: grails-app/domain/com/mrhaki/grails/User.groovy
package com.mrhaki.grails

import grails.rest.*

@Resource(uri = '/users', superClass = NonDeleteRestfulController)
class User {

    String username
    String lastname
    String firstname
    String email

    static constraints = {
        email email: true
        lastname nullable: true
        firstname nullable: true
    }

}
