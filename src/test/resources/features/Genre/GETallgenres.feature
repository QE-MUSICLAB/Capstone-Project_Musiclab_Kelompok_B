Feature: show All Genres

  Scenario: Show all genres with valid data
    Given User login mentor with account
    When show all genres with valid params
    And Send request for all genress with valid params
    Then Status code should be 200 OK
    And Validate response genres body message "success show all genres"
    And Validate all genres JSON Schema


  Scenario: Show all genres with invalid params
    Given User login mentor with account
    When show all genres with invalid params
    And Send request for all genress inwith valid params
    Then Status code should be 404 Not Found
    And Validate response invalid genres body message "Not Found"
    And Validate all invalid genres JSON Schema
