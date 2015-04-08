// File: test/unit/com/mrhaki/grails/SampleTagLibSpec.groovy
package com.mrhaki.grails

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SampleTagLib)
class SampleTagLibSpec extends Specification {

    def "attribute v returns default value if attribute is not set"() {
        expect:
        applyTemplate('&lt;sample:sample/&gt;') == '42.0'
    }

    def "attribute v returns value if attribute v if set"() {
        expect:
        applyTemplate('&lt;sample:sample v="${v}"/&gt;', [v: 10.1]) == '10.1'
    }

}
