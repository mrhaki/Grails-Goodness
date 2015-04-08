import grails.test.*

class SimpleControllerTests extends ControllerUnitTestCase {
    void testParams() {
        controller.params.paramInt = '42'
        controller.params.paramShort = '128'
        controller.params.paramByte = '8'
        controller.params.paramLong = '90192'
        controller.params.paramDouble = '12.3'
        controller.params.paramFloat = '901.22'
        controller.params.paramBoolean = 'true'

        def result = controller.submit()
        assertEquals 42, result.intValue
        assertEquals 128, result.shortValue
        assertEquals 8, result.byteValue
        assertEquals 90192L, result.longValue
        assertEquals 12.3, result.doubleValue
        assertEquals 901.22f, result.floatValue
        assertTrue result.booleanValue
    }
    
    void testInvalidParams() {
        controller.params.paramInt = 'test'

        def result = controller.submit()
        assertNull result.intValue
    }
    
    void testBooleanParam() {
        controller.params.paramBoolean = 'false'
        def result = controller.submit()
        assertFalse result.booleanValue
    }
}

