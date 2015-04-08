// Sample command object with URL constraint.
class WebAddress {
    String address

    static constraints = {
        address url: ['129.167.0.1:\\d{4}', 'mrhaki'] 

        // Or one String value if only regular expression is necessary: 
        // address url: '129.167.0.1:\\d{4}'

        // Or simple enable URL validation and don't allow
        // extra hostnames or authorities to be valid
        // address url: true
    }
}
