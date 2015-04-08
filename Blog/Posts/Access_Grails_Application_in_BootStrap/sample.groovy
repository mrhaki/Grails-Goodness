class BootStrap {
    // Reference to Grails application.
    def grailsApplication

    def init = { servletContext ->
        // Access Grails application properties.
        grailsApplication.serviceClasses.each {
            println it 
        } 
    }

    def destroy = {}
}
