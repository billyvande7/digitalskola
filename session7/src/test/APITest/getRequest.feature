Feature: Get Request

  Background:
  Given url baseURL
    And print "start get"

  @get @test
  Scenario: Get User
    When method get
    And path "/billyv"
    Then status 200
    And print response