// File: grails-app/conf/BuildConfig.groovy
...
repositories {
    ...
    // Configure Bintray JCenter as repo.
    jcenter {
        // Allowed values: never, always, daily (default), interval:seconds.
        updatePolicy 'always' 
        // Allowed values: fail, warn, ignore
        checksumPolicy 'fail'
    }
    ...
}
...
