Feature: POST make transaction mentor and student

  @Musiclab @PositiveCase @PostALL @Student
  Scenario: Post Make transaction with valid data
    Given User login student with account
    When Post make transaction with valid request body
    And send request body for transaction
    Then Status code should be 201 Created
    And Validate response body message make transaction "success make transaction"
    And Validate JSON Schema make transaction

  @Musiclab @NegativeCase @PostALL @Student
  Scenario: Post Make transaction with empty class id
    Given User login student with account
    When Post make transaction with empty class id request body
    And send request body for transaction empty class id
    Then Status code should be 400 Bad Request
    And Validate response body message empty class id make transaction "input format incorrect"
    And Validate JSON Schema make transaction empty class id

  @Musiclab @NegativeCase @PostALL @Student
  Scenario: Post Make transaction with schedule id
    Given User login student with account
    When Post make transaction with schedule id request body
    And send request body for transaction schedule id
    Then Status code should be 400 Bad Request
    And Validate response body message empty class id make transaction "input format incorrect"
    And Validate JSON Schema make transaction empty schedule id

  @Musiclab @NegativeCase @PostALL @Student
  Scenario: Post Make transaction with invalid start date
    Given User login student with account
    When Post make transaction with invalid start date request body
    And send request body for transaction invalid start date
    Then Status code should be 400 Bad Request
    And Validate response body message make transaction "minimum start date input is today"
    And Validate JSON Schema make transaction invalid start date

  @Musiclab @NegativeCase @PostALL @Student
  Scenario: Post Make transaction with invalid parameter
    Given User login student with account
    When Post make transaction with invalid paramter
    And send request body for transaction with invalid parameter
    Then Status code should be 404 Not Found
    And Validate response body message make transaction "Not Found"
    And Validate JSON Schema make transaction with invalid parameter

  @Musiclab @NegativeCase @PostALL @Student
  Scenario: Post Make transaction with empty body request
    Given User login student with account
    When Post make transaction with empty body request
    And send request body for transaction with empty body request
    Then Status code should be 400 Bad Request
    And Validate response body message make transaction "minimum start date input is today"