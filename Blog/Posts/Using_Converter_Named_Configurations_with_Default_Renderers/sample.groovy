$ curl -X GET http://localhost:8080/rest-sample/users/1
{
    "class": "com.mrhaki.grails.User",
    "id": 1,
    "email": "hubert@mrhaki.com",
    "firstname": "Hubert",
    "lastname": "Klein Ikkink",
    "username": "mrhaki"
}
$ curl -X GET http://localhost:8080/rest-sample/users/1?format=short
{
    "id": 1,
    "username": "mrhaki"
}
$ curl -X GET http://localhost:8080/rest-sample/users/1?format=details
{
    "id": 1,
    "username": "mrhaki",
    "email": "hubert@mrhaki.com",
    "fullname": "Hubert Klein Ikkink"
}
