Feature: Register Student and Mentor


  @Musiclab @PositiveCase @Register @Student
  Scenario:Register new student with valid data
    Given Register new student with valid data
    When  Send request body for register new student
    Then  Status code should be 201 Created
    And   Validate register student with json schema validator


  @Musiclab @NegativeCase @Register @Student
  Scenario:Register new student with invalid data
    Given Register new student with invalid data
    When  Send request body for register student with invalid data
    Then  Status code should be 400 Bad Request
    And   Validate register student using invalid data with json schema validator

  @Musiclab @NegativeCase @Register @Student
  Scenario:Register new student without data
   Given Register new student without data
    When Send request body for register new student without data
    Then Status code should be 400 Bad Request
    And  Validate register student without data with json schema validator


  @Musiclab @NegativeCase @Register @Student
  Scenario:Register new student with invalid path
    Given Register new student with invalid path
    When  Send request body for register new student with invalid path
    Then  Status code should be 404 Not Found
    And   Validate register student using invalid path data with json schema validator


  @Musiclab @NegativeCase @Register @Student
  Scenario:Register new student with incomplete data
    Given Register new student with incomplete data
    When  Send request body for register new student with incomplete data
    Then  Status code should be 400 Bad Request
    And   Validate register student using incomplete data with json schema validator


  @Musiclab @NegativeCase @Register @Student
  Scenario:Register new student with data has been used
    Given Register new student with data has been used
    When  Send request body for register new student with data has been used
    Then  Status code should be 400 Bad Request
    And   Validate register student using data has been used with json schema validator


  @Musiclab @PositiveCase @Register @Mentor
  Scenario:Register new mentor with valid data
    Given Register new mentor with valid data
    When  Send request body for register new mentor
    Then  Status code should be 201 Created
    And   Validate register mentor with json schema validator



  @Musiclab @NegativeCase @Register @Mentor
  Scenario:Register new mentor with invalid data
    Given Register new mentor with invalid data
    When  Send request body for register new mentor with invalid data
    Then  Status code should be 400 Bad Request
    And   Validate register mentor using invalid data with json schema validator


  @Musiclab @NegativeCase @Register @Mentor
  Scenario:Register new mentor without data
    Given Register new mentor without data
    When  Send request body for register new mentor without data
    Then  Status code should be 400 Bad Request
    And  Validate register mentor without data with json schema validator


  @Musiclab @NegativeCase @Register @Mentor
  Scenario:Register new mentor with invalid path
    Given Register new mentor with invalid path
    When  Send request body for register new mentor with invalid path
    Then  Status code should be 404 Not Found
    And   Validate register mentor using invalid path data with json schema validator


  @Musiclab @NegativeCase @Register @Mentor
  Scenario:Register new Mentor with incomplete data
    Given Register new Mentor with incomplete data
    When  Send request body for register new Mentor with incomplete data
    Then  Status code should be 400 Bad Request
    And   Validate register mentor using incomplete data with json schema validator


  @Musiclab @NegativeCase @Register @Mentor
  Scenario:Register new Mentor with data has been used
    Given Register new Mentor with data has been used
    When  Send request body for register new Mentor with data has been used
    Then  Status code should be 400 Bad Request
    And   Validate register mentor using data has been used with json schema validator
