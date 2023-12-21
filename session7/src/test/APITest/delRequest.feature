Feature: Del Request

  Background:
    Given url baseURL
    And print "start del"

  @test
  Scenario:
    When path '/billyv
    And method delete
    Then status 204