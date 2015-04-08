// File: grails-app/conf/spring/resources.groovy
import com.mrhaki.grails.Sample

beans = {
    // Define bean with default value for property environment.
    // Bean definition is overridden in Environment.executeForCurrentEnvironment block.
    sample(Sample) {
        environment = 'default'
    }

    if (grailsApplication.config.sample.load) {
        sample(Sample) {
            environment = 'Set by configuration'
        }
    }
}
