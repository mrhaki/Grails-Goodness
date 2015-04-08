package com.mrhaki.templates

import groovy.text.SimpleTemplateEngine

class MessageService {

    def grailsResourceLocator

    String template

    String followUpMessage(final String user, final String subject) {
        final Resource template = grailsResourceLocator.findResourceForURI(template)
        final Map binding = [user: user, subject: subject]
        final SimpleTemplateEngine templateEngine = new SimpleTemplateEngine()
        templateEngine.createTemplate(template.URL).make(binding)
    }
}
