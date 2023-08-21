Feature: PUT Student Profile

  @Musiclab @PositiveCase @PutALL @Student
  Scenario: Put edit student profile with valid request body
    Given User login student with account
    When put edit student profile with valid request body
    And send put request for body student profile
    Then Status code should be 200 OK
    And Validate response body update student profile for message should be "success update student profile"
    And Validate message respon body JSON Schema


  @Musiclab @NegativeCase @PutALL @Student
    Scenario: Put edit student profile with empty name on request body
      Given User login student with account
      When put edit student profile with empty name on request body
      And send put request for body empty name
      Then Status code should be 400 Bad Request
      And Validate respon body "validate: Key: 'Core.Name' Error:Field validation for 'Name' failed on the 'required' tag"

  @Musiclab @NegativeCase @PutALL @Student
  Scenario: Put Edit student profil with invalid params
    Given User login student with account
    When put edit student profile with invalid params
    And send put request for invalid params
    Then Status code should be 404 Not Found
    And Validate response body for message "Not Found"

  @Musiclab @NegativeCase @PutALL @Student
    Scenario: Put Edit student profil with empty request body
      Given User login student with account
      When put edit studet profile with empty request body
      And send put request for empty request body
      Then Status code should be 400 Bad Request
      And Validate response JSON Schema

