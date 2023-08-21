Feature: Get Mentor profile

  @Musiclab @PositiveCase @Mentor
  Scenario:Get mentor profile with valid path
    Given User login mentor with account
    When  Get mentor profile with valid path
    And   Send request get for mentor profile
    Then  Status code should be 200 OK
    And   Validate get mentor profile with json schema validator


  @Musiclab @NegativeCase @Mentor
  Scenario:Get mentor profile with invalid path
    Given User login mentor with account
    When  Get mentor profile with invalid path
    And   Send request get for mentor profile with invalid path
    Then  Status code should be 400 Bad Request
    And   Validate get mentor profile using invalid path with json schema validator

