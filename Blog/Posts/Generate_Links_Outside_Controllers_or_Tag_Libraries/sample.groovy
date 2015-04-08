// File: grails-app/service/link/generator/LinkService.groovy
package link.generator

import org.codehaus.groovy.grails.web.mapping.LinkGenerator

class LinkService {

    // Inject link generator
    LinkGenerator grailsLinkGenerator

    String generate() {
        // Generate: http://localhost:8080/link-generator/sample/show/100
        grailsLinkGenerator.link(controller: 'sample', action: 'show', id: 100, absolute: true)
    }

    String resource() {
        // Generate: /link-generator/css/main.css
        grailsLinkGenerator.resource(dir: 'css', file: 'main.css')
    }

    String contextPath() {
        // Generate: /link-generator
        grailsLinkGenerator.contextPath
    }

    String serverUrl() {
        // Generate: http://localhost:8080/link-generator
        grailsLinkGenerator.serverBaseURL
    }
}
