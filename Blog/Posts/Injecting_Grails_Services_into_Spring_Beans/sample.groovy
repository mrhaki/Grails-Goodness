// File: test/integration/com/mrhaki/sample/SpringBeanTests.groovy
package com.mrhaki.sample

import com.mrhaki.sample.bean.Shorten

public class SpringBeansTests extends GroovyTestCase {

    Shorten shorten

    void testShorten() {
        assertEquals(['G', 'J', 'C', 'S'], shorten.firstLetter())
    }

}
