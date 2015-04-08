// File: src/groovy/com/mrhaki/grails/Person.groovy
package com.mrhaki.grails

import org.springframework.stereotype.Component
import org.springframework.context.annotation.Profile

@Component
@Profile('development')
class Person {
    String name
    String email
}
