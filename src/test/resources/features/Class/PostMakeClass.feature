Feature: Post Make Class

  @Musiclab @PositiveCase @Class
  Scenario:Post make class with valid request body
    Given User login mentor with account
    When  Post make class with valid request body
    And   Send request body for create class
    Then  Status code should be 201 Created
    And   Validate Post make class with json schema validator


  @Musiclab @NegativeCase @Class
  Scenario:Post make class with invalid path
    Given User login mentor with account
    When  Post make class with valid request body using invalid path
    And   Send request body for create class using invalid path
    Then  Status code should be 405 Method Not Allowed
    And   Validate Post make class using invalid path with json schema validator


  @Musiclab @NegativeCase @Class
  Scenario:Post make class with empty request body
    Given User login mentor with account
    When  Post make class with empty request body
    And   Send request body for create class with empty request body
    Then  Status code should be 500 Internal Server Error
    And   Validate Post make class using empty request body with json schema validator


