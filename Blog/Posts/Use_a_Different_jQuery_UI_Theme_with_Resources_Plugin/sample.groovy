// File: grails-app/conf/Config.groovy
grails.resources.modules = {
    core {
        dependsOn 'jquery-ui'
    }
    // Define reference to custom jQuery UI theme
    overrides {
        'jquery-theme' {
            resource id: 'theme', url: '/css/custom-theme/jquery-ui.custom.css'
        }
    }
}
