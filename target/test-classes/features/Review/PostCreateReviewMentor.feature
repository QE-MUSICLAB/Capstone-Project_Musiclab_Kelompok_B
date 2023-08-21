Feature: Post Create Review Mentor

  @Musiclab @PositiveCase @Review @Student
  Scenario:Post make review class with valid request body using valid path {id}
    Given User login student with account
    When  Post make review class with valid request body using valid path 35
    And   Send request body for create review mentor
    Then  Status code should be 201 Created
    And   Validate Post make review class with json schema validator

  @Musiclab @NegativeCase @Review @Student
  Scenario:Post make review class with invalid request body using invalid path {id}
    Given User login student with account
    When  Post make review class with invalid request body using invalid path 1
    And   Send request body for create review mentor
    Then  Status code should be 400 Bad Request
    And   Validate Post make review class invalid request body using invalid path with json schema validator

  @Musiclab @NegativeCase @Review @Student
  Scenario:Post make review class with empty request body using valid path {id}
    Given User login student with account
    When  Post make review class with empty request body using valid path 15
    And   Send request body for create review mentor
    Then  Status code should be 400 Bad Request
    And   Validate Post make review class empty request body using invalid path with json schema validator




