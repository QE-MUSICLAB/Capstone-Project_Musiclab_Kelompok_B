Feature: Delete Mentor Schedule

  @MusicLab @PositiveCase @DeleteSchedule @Mentor
  Scenario Outline: Delete mentor schedule with valid path
    Given User login mentor with account
    When  Delete mentor schedule with valid path <id>
    And   Send DELETE request for delete schedule
    Then  Status code should be 200 OK
    Examples:
      | id |
      | 14 |

  @MusicLab @NegativeCase @DeleteSchedule @Mentor
  Scenario Outline: Delete mentor schedule with invalid path
    Given User login mentor with account
    When  Delete mentor schedule with invalid path <id>
    And   Send DELETE request for delete schedule with invalid path
    Then  Status code should be 404 Not Found
    Examples:
      | id |
      | 1s |



