Feature: Post Mentor Schedule Check

  @MusicLab @PositiveCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with valid request body
    Given User login mentor with account
    When  Post mentor schedule check with valid request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 200 OK
    And   Validate Post make schedule with json schema validator

  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with invalid request body
    Given User login mentor with account
    When  Post mentor schedule check with invalid request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 400 Bad Request

  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with empty request body
    Given User login mentor with account
    When  Post mentor schedule check with empty request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 400 Bad Request

  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with empty value class_id request body
    Given User login mentor with account
    When  Post mentor schedule check with empty value class_id request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 400 Bad Request

  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with empty value schedule_id request body
    Given User login mentor with account
    When  Post mentor schedule check with empty value schedule_id request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 400 Bad Request

  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with empty value start_date request body
    Given User login mentor with account
    When  Post mentor schedule check with empty value start_date request body
    And   Send request body for create mentor schedule check
    Then  Status code should be 400 Bad Request


  @MusicLab @NegativeCase @ScheduleCheck @Mentor
  Scenario:Post mentor schedule check with invalid path
    Given User login mentor with account
    When  Post mentor schedule check with invalid path
    And   Send request body for create mentor schedule check with invalid path
    Then  Status code should be 405 Method Not Allowed
    And   Validate Post make schedule with json schema validator





