Feature:Get All Chat Group

  @Musiclab @PositiveCase @GetStudent @Inbox
  Scenario Outline: Get all chat group with valid path
    Given User login student with account
    And Get all chat group with valid <page> as page and <limit> as limit
    When Send request get all chat group
    Then Status code should be 200 OK
    Examples:
      | page | limit |
      | 1    | 3     |

  @Musiclab @NegativeCase @GetStudent @Inbox
  Scenario Outline: Get all chat group with invalid path
    Given User login student with account
    And Get all chat group with invalid "<page>" as page and "<limit>" as limit
    When Send request get all chat group
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      | satu | tiga  |