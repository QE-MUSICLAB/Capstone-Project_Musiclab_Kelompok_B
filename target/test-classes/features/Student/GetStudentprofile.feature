Feature: Get Studen Profile

  @Tugas
  Scenario: Get show student profile with valid id
    Given User login student with account
    When show student profile with valid params
    And request for show student profile with valid params
    Then Status code should be 200 OK
    And Validate response body for message should be "success show student profile"
    And Validate get student profile JSON Schema

  Scenario: Get show student profile with invalid Method
    Given User login student with account
    When show student profile with invalid method
    And request for show student profile with invalid method
    Then Status code should be 405 Method Not Allowed
    And Validate response invalid method body for message should be "Method Not Allowed"
    And Validate get student profile invalid method JSON Schema

  Scenario: Get show studen profile with invalid params
    Given User login student with account
    When show student profile with invalid params
    And request for show student profile with invalid params
    Then Status code should be 404 Not Found
    And Validate response invalid params body for message should be "Not Found"
    And Validate get student profile invalid params JSON Schema