// File: grails-app/conf/BootStrap.groovy
class BootStrap {
    def grailsApplication

    def init = { ctx ->
        setupServiceLogging()
    }
    
    def destroy = { }
    
    private def setupServiceLogging() {
        grailsApplication.serviceClasses.each { serviceClass ->
            serviceClass.metaClass.invokeMethod = { name, args ->
                delegate.log.info "&gt; Invoke $name in ${delegate.class.name}"
                def metaMethod = delegate.metaClass.getMetaMethod(name, args)
                try {
                    def result = metaMethod.invoke(delegate, args)
                    delegate.log.info "&lt; Completed $name with result '$result'"
                    return result
                } catch (e) {
                    delegate.log.error "&lt; Exception occurred in $name"
                    delegate.log.error "&lt; Exception message: ${e.message}"
                    throw e
                }
            }
        }
    }
}
