package com.mrhaki.grails.web

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SampleController)
class SampleControllerSpec extends Specification {

    def "index action renders mock template with given username"() {
        given:
        // Mock implementation with escaped $ (\$), because otherwise
        // the String is interpreted by Groovy as GString.
        groovyPages['/sample/_header.gsp'] = "username=\${username ?: 'empty'}"

        // Or we can use views property:
        //views['/sample/_header.gsp'] = "username=\${username ?: 'empty'}"

        and:
        params.username = username

        when:
        controller.index()

        then:
        response.text.trim() == expectedOutput

        where:
        username || expectedOutput
        'mrhaki' || 'username=mrhaki'
        null     || 'username=empty'
    }

}
