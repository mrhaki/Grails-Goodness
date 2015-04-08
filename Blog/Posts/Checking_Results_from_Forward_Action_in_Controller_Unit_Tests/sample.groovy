package com.mrhaki.grails

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(BookController)
class BookControllerSpecification extends Specification {

    def "index must forward to show action"() {
        when:
        controller.index()

        then:
        forwardedUrl == '/book/show'
    }

    def "index must set parameter fromIndex to value true and forward"() {
        when:
        controller.index()

        then:
        forwardedParams.fromIndex == 'true'
    }

    def "index must set parameter bookId to 200 and forward"() {
        when:
        controller.index()

        then:
        forwardedParams.bookId == '200'
    }

    private getForwardedParams() {
        parseResponseForwardedUrl()[1]
    }

    private String getForwardedUrl() {
        parseResponseForwardedUrl()[0]
    }

    private parseResponseForwardedUrl() {
        // Pattern for forwardedUrl stored in response.
        def forwardedUrlPattern = ~/\/grails\/(.*)?\.dispatch\?*(.*)/

        // Match forwardedUrl in response with pattern.
        def matcher = response.forwardedUrl =~ forwardedUrlPattern

        def forwardUrl = null
        def forwardParameters = [:]

        if (matcher) {
            // Url is first group in pattern. We add '/' so it has the same format as redirectedUrl from response.
            forwardUrl = "/${matcher[0][1]}"

            // Parse parameters that are available in the forwardedUrl of the response.
            forwardParameters = parseResponseForwardedParams(matcher[0][2])
        }

        [forwardUrl, forwardParameters]
    }

    private parseResponseForwardedParams(final String queryString) {
        // Query string has format paramName=paramValue&param2Name=param2Value. & is optional.
        def parameters = queryString.split('&')

        // Turn the paramName=paramValue parts into a Map.
        def forwardParameters = parameters.inject([:]) { result, parameter ->
            def (parameterName, parameterValue) = parameter.split('=')
            result[parameterName] = parameterValue
            result
        }
        forwardParameters
    }
}
