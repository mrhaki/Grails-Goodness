class SimpleControllerTests extends grails.test.ControllerUnitTestCase {
    void setUp() { super.setUp() }

    void testHelloAction() {
        controller.params.msg = 'Hello world'
        controller.hello()
        assertTrue 'world', controller.chainArgs.action
        assertTrue 'other', controller.chainArgs.controller
        assertTrue 'Hello world', controller.chainArgs.model.message.text
    }
}
