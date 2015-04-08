// File: grails-app/conf/UrlMappings.groovy
class UrlMappings {

    static mappings = {
        // Using grouping for mappings starting with /admin:
        group("/admin") {
            "/report/$action?/$id?(.${format})?"(controller: 'report')
            "/users/$action?/$id?(.${format})?"(controller: 'userAdmin')
        }

        "/"(view:"/index")
        "500"(view:'/error')
    }
}
