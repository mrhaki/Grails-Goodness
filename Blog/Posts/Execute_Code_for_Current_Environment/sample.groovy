package environment

import grails.util.Environment

class ExecuteController {

    def index = { 
        def result
     
        Environment.executeForCurrentEnvironment {
            development {
                result = 'Running in DEV mode.'
            }
            production {
                result = 'Running in production mode.'
            }
            myenv {
                result = 'Running in custom "myenv" mode.'
            }
        }
    
        render result
    }
}
