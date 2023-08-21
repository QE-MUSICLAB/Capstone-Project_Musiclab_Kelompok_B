Feature: Get Mentor Class

  @Musiclab @PositiveCase @Class
    #BUG
  Scenario Outline:Get mentor class with valid path
    Given User login mentor with account
    When  Get mentor class with valid path <id>
    And   Send request GET for get mentor class
    Then  Status code should be 200 OK
    And   Validate get mentor class with json schema validator
    Examples:
      | id |
      | 6  |

  @Musiclab @NegativeCase @Class
  Scenario Outline:Get mentor class with invalid path
    Given User login mentor with account
    When  Get mentor class with invalid path <id>
    And   Send request GET for get mentor class
    Then  Status code should be 404 Not Found
    And   Validate get mentor class using invalid path with json schema validator
    Examples:
      | id   |
      | 1000 |

  @Musiclab @NegativeCase @Class
  Scenario:Get mentor class with empty path
    Given User login mentor with account
    When  Get mentor class with empty path
    And   Send request GET for get mentor class with empty path
    Then  Status code should be 404 Not Found
    And   Validate get mentor class using empty path with json schema validator

