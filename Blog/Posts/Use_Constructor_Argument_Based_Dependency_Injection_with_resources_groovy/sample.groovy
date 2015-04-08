// File: grails-app/conf/spring/resources.groovy
import com.mrhaki.spring.LanguageProvider

beans = {

    languageProvider(LanguageProvider) { beanDefinition ->
        // Pass constructor arguments: ref('languageService') and '^Gr.*'
        // to LanguageProvider.
        beanDefinition.constructorArgs = [ref('languageService'), '^Gr.*']
    }
}
