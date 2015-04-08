// File: grails-app/conf/UrlMappings.groovy
import static org.codehaus.groovy.grails.web.mapping.DefaultUrlMappingEvaluator.*

import org.codehaus.groovy.grails.web.mapping.DefaultUrlMappingEvaluator

class UrlMappings {

    static mappings = {
        // Exclude the 'create' and 'edit' actions for the 
        // automatically created mappings.
        "/api/users"(resources: 'user', excludes: [ACTION_CREATE, ACTION_EDIT])

        // Include only the 'index' and 'show' actions for the 
        // automatically created mappings.
        "/api/products"(resources: 'product', includes: [ACTION_INDEX, ACTION_SHOW])
    }
}
