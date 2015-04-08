package com.mrhaki.render

import org.codehaus.groovy.grails.core.io.ResourceLocator
import org.springframework.core.io.Resource

class ImageController {

    ResourceLocator grailsResourceLocator

    def index() {
        final Resource image = grailsResourceLocator.findResourceForURI('/images/grails_logo.png')
        render file: image.inputStream, fileName: 'logo.png' 
    }
    
}
