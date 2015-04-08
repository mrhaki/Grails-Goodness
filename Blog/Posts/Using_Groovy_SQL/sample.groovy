package com.mrhaki.grails

import groovy.sql.GroovyRowResult

class PersonService {

    // Reference to groovySql defined in resources.groovy.
    def groovySql

    List&lt;GroovyRowResult&gt; allPersons(final String searchQuery) {
        final String searchString = "%${searchQuery.toUpperCase()}%"

        final String query = '''\
            select id, name, email 
            from person 
            where upper(email collate UNICODE_CI_AI) like :search
        '''

        // Use groovySql bean to execute the query.
        final results = groovySql.rows(query, search: searchString)
        results
    }

}
