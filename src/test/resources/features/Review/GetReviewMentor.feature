Feature: Get Review Mentor

  @Musiclab @PositiveCase @Review
  Scenario:Get mentor review with valid path
    Given User login student with account
    When  Get mentor review class with valid path 15
    And   Send get request for review mentor
    Then  Status code should be 200 OK
    And   Validate get review mentor with json schema validator

  @Musiclab @NegativeCaseCase @Review
  Scenario:Get mentor review with empty path
    Given User login student with account
    When  Get mentor review class with empty path
    And   Send get request for review mentor with empty path
    Then  Status code should be 404 Not Found
    And   Validate get review class using empty path with json schema validator