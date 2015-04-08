// File: conf/BuildConfig.groovy
grails.war.resources = { stagingDir ->
    echo message: "StagingDir: $stagingDir"
    delete(verbose: true) {
        fileset(dir: stagingDir) {
            include name: '**/Thumbs.db'
        }
    }
}
