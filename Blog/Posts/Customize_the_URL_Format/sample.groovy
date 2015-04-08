// File: grails-app/conf/spring/resources.groovy
import static grails.web.UrlConverter.BEAN_NAME as UrlConverterBean

beans = {
...
    "${UrlConverterBean}"(customize.url.format.CustomUrlConverter)
...
}
