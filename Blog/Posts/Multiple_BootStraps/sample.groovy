// File: grails-app/conf/SampleBootStrap.groovy
class SampleBootStrap {
    def init = { servletContext -&gt;
        log.debug("Running init SampleBootStrap")
    }
    def destroy = {
        log.debug("Running destroy SampleBootStrap")
    }
}
