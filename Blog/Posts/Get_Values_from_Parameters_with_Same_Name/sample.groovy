// File: grails-app/controllers/SimpleController.groovy
class SimpleController {

    def test = {
        // Handles a query like 'http://localhost:8080/simple?role=admin&role=user'
        def roles = params.list('role')
        render roles.join(',')  // Returns admin,user
    }

}
