// File: grails-app/conf/Config.groovy
import org.apache.log4j.appender.TimeAndSizeRollingAppender
...
log4j = {
    appenders {
        appender new TimeAndSizeRollingAppender(name: 'timeAndSizeRollingAppender',
                     file: 'logs/app.log', datePattern: '.yyyy-MM-dd',
                     maxRollFileCount: 7, compressionAlgorithm: 'GZ',
                     compressionMinQueueSize: 2,
                     layout: pattern(conversionPattern: "%d [%t] %-5p %c{2} %x - %m%n"))
    }

    root {
        // Use the appender.
        debug 'timeAndSizeRollingAppender'
    }
}
...
