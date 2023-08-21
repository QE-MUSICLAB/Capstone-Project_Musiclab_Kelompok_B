Feature: Put Edit Password Mentor

  @Musiclab @PositiveCase  @Mentor
  Scenario:Put edit mentor password with valid request body
    Given User login mentor with account
    When  Put edit mentor password with valid request body
    And   Send request body for update mentor password
    Then  Status code should be 200 OK
    And   Validate put edit password with json schema validator

  @Musiclab @NegativeCase @Mentor
  Scenario:Put edit mentor password with invalid request body
    Given User login mentor with account
    When  Put edit mentor password with invalid request body
    And   Send request body for update mentor password
    Then  Status code should be 400 Bad Request
    And   Validate put edit password using invalid request body with json schema validator

  @Musiclab @NegativeCase @Mentor
  Scenario:Put edit mentor password with empty old password
    Given User login mentor with account
    When  Put edit mentor password with empty old password
    And   Send request body for update mentor password
    Then  Status code should be 400 Bad Request
    And   Validate put edit password using empty old password with json schema validator


  @Musiclab @NegativeCase  @Mentor
  Scenario:Put edit mentor password with empty new old password
    Given User login mentor with account
    When  Put edit mentor password with empty new old password
    And   Send request body for update mentor password
    Then  Status code should be 400 Bad Request
    And   Validate put edit password using empty new password with json schema validator


  @Musiclab @NegativeCase  @Mentor
  Scenario:Put edit mentor password with empty confirmation old password
    Given User login mentor with account
    When  Put edit mentor password with empty confirmation old password
    And   Send request body for update mentor password
    Then  Status code should be 400 Bad Request
    And   Validate put edit password using empty confirmation password with json schema validator


  @Musiclab @NegativeCase  @Mentor
  Scenario:Put edit mentor password with all empty value of password
    Given User login mentor with account
    When  Put edit mentor password with all empty value of password
    And   Send request body for update mentor password
    Then  Status code should be 400 Bad Request
    And   Validate put edit password using all empty value of password with json schema validator





