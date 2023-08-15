Feature: Post Make Class

  @Musiclab @PositiveCase @MakeClassMentor @Mentor
  Scenario:Post make class with valid request body
    Given User login mentor with account
    When  Post make class with valid request body
    And   Send request body for create class
    Then  Status code should be 201 Created
    And   Validate Post make class with json schema validator


  @Musiclab @NegativeCase @MakeClassMentor @Mentor
  Scenario:Post make class with invalid path
    Given User login mentor with account
    When  Post make class with valid request body using invalid path
    And   Send request body for create class using invalid path
    Then  Status code should be 405 Method not allowed
    And   Validate Post make class using invalid path with json schema validator


  @Musiclab @NegativeCase @MakeClassMentor @Mentor
  Scenario:Post make class with incomplete request body
    #BUG
    Given User login mentor with account
    When  Post make class with incomplete request body
    And   Send request body for create class with incomplete request body
    Then  Status code should be 400 Bad Request
    And   Validate Post make class using invalid incomplete request body with json schema validator


