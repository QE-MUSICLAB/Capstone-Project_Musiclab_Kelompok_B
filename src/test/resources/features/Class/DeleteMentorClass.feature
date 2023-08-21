Feature: Delete Mentor Class

  @Musiclab @PositiveCase @Class
    #BUG
  Scenario Outline: Delete class mentor with valid path
    Given User login mentor with account
    When  Delete class mentor with valid path <id>
    And   Send DELETE request for delete class
    Then  Status code should be 200 OK
    And   Validate delete class using valid path with json schema validator
    Examples:
      | id |
      | 6  |

  @Musiclab @NegativeCase @Class
  Scenario Outline: Delete class mentor with invalid path
    Given User login mentor with account
    When  Delete class mentor with invalid path <id>
    And   Send DELETE request for delete class
    Then  Status code should be 400 Bad Request
    And   Validate delete class using invalid path with json schema validator
    Examples:
      | id |
      | s  |



