Feature: Get Studen Profile

  @Tugas
  Scenario: Get show student profile with valid id
    Given User login student with account
    When show student profile with valid params
    And request for show student profile with valid params
    Then Status code should be 200 OK
#    And Validate response body for message should be "succes show student profile"
#    And Validate get student profile JSON Schema