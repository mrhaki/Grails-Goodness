// File: grails-app/conf/spring/resources.groovy
import com.mrhaki.spring.Person

beans = {

    // Using named arguments to set property values. The named arguments
    // can be grouped together, but don't have to. Groovy will automatically
    // group them together into a Map and makes it the first argument of 
    // the 'mrhaki() bean definition method'.
    mrhaki(name: 'mrhaki', Person, birthDate: Date.parse('yyyy-MM-dd', '1973-7-9'))

}
