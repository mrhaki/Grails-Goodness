class User {
    static searchable = true
    String username
}

class UserTests extends GrailsUnitTestCase {
    void testSearch() {
        registerMetaClass User
        User.metaClass.static.search = { searchText -&gt;
            [results: [new User(username:'mrhaki')],
             total: 1, offset: 0, scores: [1]] 
        }
        assertEquals 'mrhaki', User.search('mrhaki').results[0].username
    }
}
