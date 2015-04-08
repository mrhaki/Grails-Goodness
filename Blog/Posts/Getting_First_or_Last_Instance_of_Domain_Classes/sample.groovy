import com.mrhaki.grails.Course

createCourse 'Grails University Getting Started', Date.parse('yyyy-MM-dd', '2013-11-01')
createCourse 'Grails University RESTful Applications'
createCourse 'Spock Sessions', Date.parse('yyyy-MM-dd', '2013-09-01')

void createCourse(final String name, final Date start = null) {
    new Course(name: name, start: start).save()
}

assert Course.first().name == 'Grails University Getting Started'
assert Course.first().start.format('yyyy-MM-dd') == '2013-11-01'

assert Course.last().name == 'Spock Sessions'
assert Course.last('name').name == 'Spock Sessions'

assert Course.last('start').name == 'Grails University Getting Started'
assert Course.first(sort: 'start').start == null
