// File: grails-app/conf/spring/resources.groovy
import com.mrhaki.json.CustomBookMarshaller
import grails.converters.JSON
import org.codehaus.groovy.grails.web.converters.configuration.ObjectMarshallerRegisterer

beans = {

    // The name is not important. The type is picked up 
    // by Grails and must be ObjectMarshallerRegisterer.
    customBookJsonMarshaller(ObjectMarshallerRegisterer) {
        // Assign custom marshaller instance.
        marshaller = new CustomBookMarshaller()

        // Set converter class type.
        converterClass = JSON

        // Optional set priority. Default value is 0.
        priority = 1
    }

}
