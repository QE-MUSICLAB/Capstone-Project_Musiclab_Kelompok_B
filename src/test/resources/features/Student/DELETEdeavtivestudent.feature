Feature:  Deactive student

  @Tugas
  Scenario: Deactive student with valid path
    Given User login student with account
    When Delete student with valid path
    And request for delete student
    Then Status code should be 200 OK
    And Validate response message "succes deactivate student"
    And Validate JSON Schema


  @Tugas
  Scenario: Deactive student with invalid path
    Given User login student with account
    When Delete student with invalid path
    And request for delete student with invalid path
    Then Status code should be 404 Not Found
    And Validate JSON Schema