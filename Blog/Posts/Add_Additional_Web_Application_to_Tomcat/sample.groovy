import org.apache.catalina.loader.WebappLoader

eventConfigureTomcat = { tomcat -&gt;
    // Use directory in the project's root for the
    // WAR file and extra directory to be included in the
    // web application's classpath.
    def aweWebappDir = new File(grailsSettings.baseDir, 'awe')
    def aweSharedDir = new File(aweWebappDir, 'shared')

    // Location of WAR file.
    def aweWarFile = new File(aweWebappDir, 'awe.war')

    // Context name for web application.
    def aweContext = '/awe'

    // Add WAR file to Tomcat as web application
    // with context /awe. 
    def context = tomcat.addWebapp(aweContext, aweWarFile.absolutePath)
    // Context is not reloadable, but can be 
    // if we want to.
    context.reloadable = false

    // Add extra directory to web application's
    // classpath for referencing configuration file needed
    // by the web application.
    def loader = new WebappLoader(tomcat.class.classLoader)
    loader.addRepository(aweSharedDir.toURI().toURL().toString())
    loader.container = context

    // Add extra loader to context.
    context.loader = loader
}
