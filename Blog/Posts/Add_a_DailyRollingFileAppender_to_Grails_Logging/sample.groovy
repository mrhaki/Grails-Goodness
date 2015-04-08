// File: conf/Config.groovy
import org.apache.log4j.DailyRollingFileAppender

log4j = {
    appenders {
        appender new DailyRollingFileAppender(
            name: 'dailyAppender',
            datePattern: "'.'yyyy-MM-dd",  // See the API for all patterns.
            fileName: "logs/${appName}.log",
            layout: pattern(conversionPattern:'%d [%t] %-5p %c{2} %x - %m%n')        
        )
    }
    
    root {
        info 'dailyAppender'
    }    
}
