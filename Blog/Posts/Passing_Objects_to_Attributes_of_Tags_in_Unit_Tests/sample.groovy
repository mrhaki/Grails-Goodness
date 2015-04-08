package com.mrhaki.grails

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(BookTagLib)
class BookTagLibSpecification extends Specification {

    def "show book title for given Book instance"() {
        given:
        final Book book = new Book(title: 'Gradle Effective Implementation Guide')

        expect:
        applyTemplate('&lt;book:title book="${bookInstance}"/&gt;', [bookInstance: book]) == 'Gradle Effective Implementation Guide'
    }

}
