Feature: Get Mentor Schedule

  @MusicLab @PositiveCase @GetSchedule @Mentor
  Scenario Outline:Get mentor schedule with valid path
    Given User login mentor with account
    When  Get mentor schedule with valid path <id>
    And   Send request GET for get mentor schedule
    Then  Status code should be 200 OK
   Examples:
      | id |
      | 39 |

  @MusicLab @NegativeCase @GetSchedule @Mentor
  Scenario Outline:Get mentor schedule with invalid path
    Given User login mentor with account
    When  Get mentor schedule with invalid path <id>
    And   Send request GET for get mentor schedule with invalid path
    Then  Status code should be 404 Not Found
   Examples:
      | id |
      | 50 |

  @MusicLab @NegativeCase @GetSchedule @Mentor
  Scenario Outline:Get mentor schedule with empty id path
    Given User login mentor with account
    When  Get mentor schedule with empty id path <id>
    And   Send request GET for get mentor schedule
    Then  Status code should be 400 Bad Request
    Examples:
      | id |
      |    |
