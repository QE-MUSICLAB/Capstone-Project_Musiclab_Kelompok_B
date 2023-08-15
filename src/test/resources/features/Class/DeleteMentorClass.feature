Feature: Delete  Class

  @Test @PositiveCase @DeleteClass @Mentor
  Scenario Outline: Delete a class with valid path
    Given User login mentor with account
    When  Delete class mentor with valid path <id>
    And   Send DELETE request for delete class
    Then  Status code should be 200 OK
    And   Validate delete class using valid path with json schema validator
    Examples:
      | id |
      | 14 |

  @Test @PositiveCase @DeleteClass @Mentor
  Scenario Outline: Delete a class with invalid path
    Given User login mentor with account
    When  Delete class mentor with invalid path <id>
    And   Send DELETE request for delete class
    Then  Status code should be 404 Not Found
    And   Validate delete class using invalid path with json schema validator
    Examples:
      | id |
      | 1s |



