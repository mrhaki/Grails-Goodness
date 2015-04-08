package com.mrhaki.grails

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

@TestFor(SampleController)
class SampleControllerSpec extends Specification {

    @Unroll
    def "index must render formatted number for request locale #locale"() {
        given: 'Set parameter number with value 42.102'
        params.number = '42.102'

        and: 'Simulate locale in request'
        request.addPreferredLocale locale

        when: 'Invoke controller action'
        controller.index()

        then: 'Check response equals expected result'
        response.text == result

        where:
        locale           || result
        Locale.US        || '42.102'
        new Locale('nl') || '42,102'
        Locale.UK        || '42.102'
    }

}
