// File: grails-app/conf/spring/resources.groovy
import grails.util.Environment

beans = {
    // Default we use the messageRemoteService as implementation of MessageService
    springConfig.addAlias 'messageService', 'messageRemoteService'

    Environment.executeForCurrentEnvironment {
        development {
            // In development we use messageLocalService as implementation
            // of MessageService.
            springConfig.addAlias 'messageService', 'messageLocalService'
        }
    }
}
