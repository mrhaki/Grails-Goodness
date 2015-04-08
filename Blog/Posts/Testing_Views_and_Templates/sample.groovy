// File: test/unit/com/mrhaki/grails/views/ItemsViewSpecification.groovy
package com.mrhaki.grails.views

import grails.test.mixin.TestMixin
import grails.test.mixin.web.GroovyPageUnitTestMixin
import spock.lang.Specification

@TestMixin(GroovyPageUnitTestMixin)
class ItemsViewSpecification extends Specification {

    def "if items are available then show items as list items"() {
        when:
        final String output = renderViewWithItems(['one'])

        then:
        output.contains '
<li>one</li>
'
    }

    def "if collection of items is empty then show message items are empty"() {
        given:
        messageSource.addMessage 'noitems', request.locale, 'NO_ITEMS'

        when:
        final String output = renderViewWithItems()

        then:
        output.contains 'NO_ITEMS'
    }

    private renderViewWithItems(items = []) {
        render(view: '/sample/items', model: [items: items])
    }

}
