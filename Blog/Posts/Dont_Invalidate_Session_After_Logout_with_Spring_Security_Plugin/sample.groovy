// File: grails-app/conf/spring/resources.groovy
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler

beans = {
    securityContextLogoutHandler(SecurityContextLogoutHandler) {
        invalidateHttpSession = false
    }
}
