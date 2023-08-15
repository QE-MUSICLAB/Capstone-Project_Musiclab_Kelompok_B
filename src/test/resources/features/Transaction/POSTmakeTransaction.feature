Feature: POST make transaction mentor and student

  @Tugas
  Scenario: Post Make transaction with valid data
    Given User login student with account
    When Post make transaction with valid request body
    And send request body for transaction
    Then Status code should be 201 Created status
    And Validate response body message make transaction "success make transaction"
    And Validate JSON Schema make transaction

  @Tugas
  Scenario: Post Make transaction with empty class id
    Given User login student with account
    When Post make transaction with empty class id request body
    And send request body for transaction empty class id
    Then Status code should be 400 Bad Request
    And Validate response body message empty class id make transaction "input format incorrect"
    And Validate JSON Schema make transaction empty class id

  @Tugas
  Scenario: Post Make transaction with schedule id
    Given User login student with account
    When Post make transaction with schedule id request body
    And send request body for transaction schedule id
    Then Status code should be 400 Bad Request
    And Validate response body message empty class id make transaction "input format incorrect"
    And Validate JSON Schema make transaction empty schedule id

  @Tugas
  Scenario: Post Make transaction with invalid start date
    Given User login student with account
    When Post make transaction with invalid start date request body
    And send request body for transaction invalid start date
    Then Status code should be 400 Bad Request
    And Validate response body message make transaction "minimum start date input is today"
    And Validate JSON Schema make transaction invalid start date