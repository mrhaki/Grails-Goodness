// File: test/unit/SimpleServiceTests.groovy
import grails.test.*

class SimpleServiceTests extends GrailsUnitTestCase {
    def service
    
    protected void setUp() {
        super.setUp()
        service = new SimpleService()
        
        mockConfig('''
            simple {
                greeting = 'Hello'
                text = 'world.'
            }
        ''')
    }
    
    protected void tearDown() {
        super.tearDown()
        service = null
    }
    
    void testSayConfig() {
        assertEquals 'Hello world.', service.sayConfig()
    }
    
    void testSay() {
        assertEquals 'Hello mrhaki', service.say('mrhaki')
    }
}
