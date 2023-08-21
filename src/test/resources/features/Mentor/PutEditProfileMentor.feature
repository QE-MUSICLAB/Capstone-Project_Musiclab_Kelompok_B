Feature: Put Edit Profile Mentor

  @Musiclab @PositiveCase  @Mentor
  Scenario:Put Update mentor profile with valid request body
    Given User login mentor with account
    When  Put Update mentor profile with valid request body
    And   Send request put for edit mentor profile
    Then  Status code should be 200 OK
    And   Validate put mentor profile with json schema validator

  @Musiclab @NegativeCase  @Mentor
  Scenario:Put Update mentor profile with invalid request body
    Given User login mentor with account
    When  Put Update mentor profile with invalid request body
    And   Send request put for edit mentor profile with invalid request body
    Then  Status code should be 404 Not Found
    And   Validate put mentor profile using invalid request body with json schema validator

  @Musiclab @NegativeCase  @Mentor
  Scenario:Put Update mentor profile with empty value body
    Given User login mentor with account
    When  Put Update mentor profile with empty value body
    And   Send request put for edit mentor profile
    Then  Status code should be 400 Bad Request
    And   Validate put mentor profile using empty value body with json schema validator

