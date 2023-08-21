Feature: Get All Mentor Class

  @Musiclab @PositiveCase @Class @Mentor
    #BUG
  Scenario Outline:Get all mentor class with valid path
    Given User login mentor with account
    When  Get all mentor class with valid path <id>
    And   Send request GET for get all mentor class
    Then  Status code should be 200 OK
    And   Validate get mentor class with json schema validator
    Examples:
      | id |
      | 39 |

  @Musiclab @NegativeCase @Class @Mentor
  Scenario Outline:Get all mentor class with invalid path
    Given User login mentor with account
    When  Get all mentor class with invalid path <id>
    And   Send request GET for get all mentor class
    Then  Status code should be 400 Bad Request
    And   Validate get all mentor class using invalid path with json schema validator
    Examples:
      | id |
      | 1s |

  @Musiclab @NegativeCase @Class @Mentor
  Scenario:Get all mentor class without path
    Given User login mentor with account
    When  Get all mentor class without path
    And   Send request GET for get all mentor class without path
    Then  Status code should be 404 Not Found
    And   Validate get all mentor class without path with json schema validator



