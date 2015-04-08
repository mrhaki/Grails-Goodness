// File: grails-app/controllers/com/mrhaki/grails/UserApiController.groovy
package com.mrhaki.grails

import grails.rest.*

class UserApiController extends RestfulController {

    // We make the resource read-only in
    // the constructor.
    UserApiController() {
        super(User, true /* read-only */)
    }

    @Override
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond listAllResources(params), formats: ['xml', 'json']
    }

    @Override
    def show() {
        respond queryForResource(params.id), formats: ['json']
    }

}
