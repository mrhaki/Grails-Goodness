// File: grails-app/services/com/mrhaki/grails/OrganisationService.groovy
package com.mrhaki.grails

class OrganisationService {

    def sessionFactory

    List&lt;Map&lt;String,String&gt;&gt; breadcrumbs(final Long startOrganisationId) {
        final session = sessionFactory.currentSession

        final String query = 'select id, name, level from organisation_breadcrumbs(:startId) order by level desc'

        final sqlQuery = session.createSQLQuery(query)

        final queryResults = sqlQuery.with {
            setLong('startId', startOrganisationId)
            list()
        }

        // Transform resulting rows to a map with key organisationName.
        final results = queryResults.collect { resultRow -&gt
            [organisationName: resultRow[1]]
        }

        // Or to only get a list of names.
        //final List&lt;String&gt; names = queryResults.collect { it[1] }

        results
    }

}
