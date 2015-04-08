package header.ctrl

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SampleController)
class SampleControllerSpec extends Specification {

    def "index must set response header X-Powered-By with value"() {
        when:
        controller.index()

        then:
        response.headerNames.contains 'X-Powered-By'
        response.header('X-Powered-By') == 'Grails: 2.2.4, Groovy: 2.0.8'
    }

}
