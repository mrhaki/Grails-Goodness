// File: grails-app/conf/Config.groovy
import org.apache.log4j.rolling.RollingFileAppender
import org.apache.log4j.rolling.TimeBasedRollingPolicy

...
log4j = {
    def rollingFile = new RollingFileAppender(name: 'rollingFileAppender', layout: pattern(conversionPattern: "%d [%t] %-5p %c{2} %x - %m%n"))
    // Rolling policy where log filename is logs/app.log.
    // Rollover each day, compress and save in logs/backup directory.
    def rollingPolicy = new TimeBasedRollingPolicy(fileNamePattern: 'logs/backup/app.%d{yyyy-MM-dd}.gz', activeFileName: 'logs/app.log')
    rollingPolicy.activateOptions()
    rollingFile.setRollingPolicy rollingPolicy

    appenders {
        appender rollingFile
    }

    root {
        // Use our newly created appender.
        debug 'rollingFileAppender'
    }
}
...
