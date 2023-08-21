Feature: Post Login Student and Mentor

  @Musiclab @PositiveCase @Login
  Scenario:Login student with valid data
    Given Login student with valid data
    When  Send request body for login student
    Then  Status code should be 200 OK
    And   Validate login student with json schema validator


  @Musiclab @NegativeCas @Login
  Scenario:Login student with invalid data using unregistered student
    Given Login student with invalid data using unregistered student
    When  Send request body for login student using unregistered student
    Then  Status code should be 404 Not Found
    And   Validate login student using invalid data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login student without request body
    Given Login student without request body
    When  Send request body for login student without data
    Then  Status code should be 400 Bad Request
    And   Validate login student without request body data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login student with invalid path
    Given Login student with invalid path
    When  Send request body for login student with invalid path
    Then  Status code should be 404 Not Found
    And   Validate login student using invalid path data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login student with incomplete data
    Given Login student with incomplete data
    When  Send request body for login student with incomplete data
    Then  Status code should be 400 Bad Request
    And   Validate login student using incomplete data data with json schema validator

  @Musiclab @PositiveCase @Login
  Scenario:Login Mentor with valid data
    Given Login Mentor with valid data
    When  Send request body for login Mentor
    Then  Status code should be 200 OK
    And   Validate login mentor with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login mentor with invalid data using unregistered mentor
    Given Login mentor with invalid data using unregistered mentor
    When  Send request body for login mentor using unregistered mentor
    Then  Status code should be 404 Not Found
    And   Validate login mentor using invalid data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login mentor without request body
    Given Login mentor without request body
    When  Send request body for login mentor without data
    Then  Status code should be 400 Bad Request
    And   Validate login mentor without request body data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login mentor with invalid path
    Given Login mentor with invalid path
    When  Send request body for login mentor with invalid path
    Then  Status code should be 404 Not Found
    And   Validate login mentor using invalid path data with json schema validator

  @Musiclab @NegativeCase @Login
  Scenario:Login mentor with incomplete data
    Given Login mentor with incomplete data
    When  Send request body for login mentor with incomplete data
    Then  Status code should be 400 Bad Request
    And   Validate login mentor using incomplete data data with json schema validator
