package com.mrhaki.grails

class SampleController {

    /**
     * Service with methods that are invoked
     * from the controller action methods.
     */ 
    ExternalService externalService

    //--------------------------------------------
    // Action methods:
    //--------------------------------------------

    /** Index action method */
    def index() { 

        // These method calls could throw a ConnectException.
        // If the ConnectException occurs then the 
        // connectException(ConnectException) method is
        // invoked and that method will handle the 
        // request further.
        final all = externalService.all(params)
        final total = externalService.count()
        
        [items: all, totalCount: total]
    }

    /** Show action method */
    def show(final Long id) {

        // This method can throw a ConnectException
        // or ResourceNotFoundException. 
        // If the ResourceNotFoundException is thrown
        // the request is further handled by 
        // the notFoundException(ResourceNotFoundException)
        // method.
        final item = externalService.get(id)
        [item: item]
    }


    //--------------------------------------------
    // Exception methods:
    //--------------------------------------------

    /**
     * If any method in this controller invokes code that
     * will throw a ConnectException then this method
     * is invoked.
     */
    def connectException(final ConnectException exception) {
        logException exception
        render view: 'error', model: [exception: exception]
    }

    /**
     * If any method in this controller invokes code that
     * will throw a ResourceNotFoundException then this method
     * is invoked.
     */
    def notFoundException(final ResourceNotFoundException exception) {
        logException exception
        render view: 'notFound',  model: [id: params.id, exception: exception]        
    }


    /** Log exception */
    private void logException(final Exception exception) {
        log.error "Exception occurred. ${exception?.message}", exception
    }

}
