Feature: Edit Password student

  @Tugas
  Scenario: Edit Student password with valid request body
    Given User login student with account
    When edit student password with valid request body
    And request for edit student password
    Then Status code should be 200 OK
    And Validate response body message "success update student password"
    And Validate message JSON Schema

    @Tugas
    Scenario: Edit student passwotd with invalid request body
      Given User login student with account
      When edit student password with wrong old password on request body
      And request for wrong old password
      Then Status code should be 400 Bad Request
      And Validate respon body message "password not matched"
      And Validate message Json schema

      @Tugas
      Scenario: Edit student passwotd with empty old password
        Given User login student with account
        When edit student password with empty old password on request body
        And request for empty old password
        Then Status code should be 400 Bad Request
        And Validate respon body message "old password, new password and confirmation password field cannot be empty"
        And Validate message Json schemas

     @Tugas
     Scenario: Edit student passwotd with empty new password
        Given User login student with account
        When edit student password with empty new password on request body
        And request for empty new password
        Then Status code should be 400 Bad Request
        And Validate respon body message "old password, new password and confirmation password field cannot be empty"
        And Validate message Json schemas

       @Tugas
       Scenario: Edit student passwotd with empty confirmation password
         Given User login student with account
         When edit student password with empty confirmation password on request body
         And request for empty confirmation password
         Then Status code should be 400 Bad Request
         And Validate respon body message "old password, new password and confirmation password field cannot be empty"
         And Validate message confirmation Json schema

  @Tugas
  Scenario: Edit student passwotd with empty request body
    Given User login student with account
    When edit student password with empty request body
    And request for empty request body
    Then Status code should be 400 Bad Request
    And Validate respon body message "old password, new password and confirmation password field cannot be empty"
    And Validate message empty request body JSON Schema
