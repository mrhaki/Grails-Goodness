package com.mrhaki.grails

class HTMLCodecControllerTests extends grails.test.ControllerUnitTestCase {
    void testAction() {
        loadCodec HTMLCodec  // Now we can use encodeAsHTML, decodeAsHTML
        assertEquals "&amp;lt;b&amp;gt;Grails&amp;lt;/b&amp;gt;", '&lt;b&gt;Grails&lt;/b&gt;'.encodeAsHTML()
    }
}
