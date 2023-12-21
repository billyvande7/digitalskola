Feature: Post Request

  Background:
    Given url baseURL
    And print "start post"

  @post @test
  Scenario: Create User
    * def body = {id": 111, "username": "billyv", "firstName": "billy", "lastName": "v", "email": "billyv@mail.com", "password": "lupagimana", "phone": "0990123", "userStatus": 1 }
    * def headerRegress = {}
    When method post
    And path "/aUser"
    Then status 200
