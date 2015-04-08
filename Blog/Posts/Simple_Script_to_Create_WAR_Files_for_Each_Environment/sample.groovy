// File: createwar.groovy
// Run with: $ groovy createwar.groovy
def ant = new AntBuilder()

// Read properties.
ant.property file: 'application.properties'

def appVersion = ant.project.properties.'app.version'
def appName = ant.project.properties.'app.name'

def envs = ['dev', 'test', 'prod', 'testserver1', 'testserver2']
envs.each { env -&gt;
    def grailsEnv = env
    ant.exec(executable: 'grails') {
        arg(value: "-Dgrails.env=${grailsEnv}")
        arg(value: 'war')
        arg(value: "dist/${appName}-${appVersion}-${grailsEnv}.war")
    }
}
