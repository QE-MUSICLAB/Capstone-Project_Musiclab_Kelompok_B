Feature: Post Mentor Schedule

  @MusicLab @PositiveCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with valid request body
    Given User login mentor with account
    When  Post mentor schedule with valid request body
    And   Send request body for create mentor schedule
    Then  Status code should be 201 Created
    And   Validate Post make schedule with json schema validator

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with invalid request body
    Given User login mentor with account
    When  Post mentor schedule with invalid request body
    And   Send request body for create mentor schedule
    Then  Status code should be 500 Internal Server Error

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with invalid path
    Given User login mentor with account
    When  Post mentor schedule with invalid path
    And   Send request body for create mentor schedule with invalid path
    Then  Status code should be 405 Method Not Allowed

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with empty request body
    Given User login mentor with account
    When  Post mentor schedule with empty request body
    And   Send request body for create mentor schedule
    Then  Status code should be 500 Internal Server Error

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with empty value day request body
    Given User login mentor with account
    When  Post mentor schedule with empty value day request body
    And   Send request body for create mentor schedule
    Then  Status code should be 500 Internal Server Error

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with empty value start time request body
    #BUG
    Given User login mentor with account
    When  Post mentor schedule with empty value start time request body
    And   Send request body for create mentor schedule
    Then  Status code should be 500 Internal Server Error

  @MusicLab @NegativeCase @PostSchedule @Mentor
  Scenario:Post mentor schedule with empty value end time request body
    #BUG
    Given User login mentor with account
    When  Post mentor schedule with empty value end time request body
    And   Send request body for create mentor schedule
    Then  Status code should be 500 Internal Server Error





