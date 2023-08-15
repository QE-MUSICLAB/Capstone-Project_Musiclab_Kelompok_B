Feature: Get mentor transaction
  @Musiclab @PositiveCase @GetALL @Mentor
  Scenario Outline: Get mentor transactions with valid parameter page
    Given User login mentor with account
    And Get mentor transactions with valid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 200 OK
    And Validate responses body for message should be "success show mentor transaction history"
    And Validate JSON Schema mentor transaction
    Examples:
      | page | limit |
      | 1    | 100    |
      | 5    | 20     |

  @Musiclab @NegativeCase @GetALL @Mentor
  Scenario Outline: Get mentor transactions with invalid parameter page and limit
    Given User login mentor with account
    And Get mentor transactions with invalid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 400 Bad Request
    And Validate responses body for message should be "invalid page parameter"
    And Validate JSON Schema invalid paramater
    Examples:
      | page | limit |
      | @   | JHO    |
      | @@    | JU     |
# BUG seharusnya 400 bad request dengan data kosong malah 200 OK
  @Musiclab @NegativeCase @GetALL @Mentor
  Scenario Outline: Get mentor transactions with empty value
    Given User login mentor with account
    And Get mentor transactions with empty value parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      |      |       |


# Student Transaction
  @Musiclab @PositiveCase @GetALL @Student
  Scenario Outline: Get students transactions with valid params
    Given User login student with account
    And Get students transactions with valid parameter <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 200 OK
    And Validate responses body for message should be "success show student transaction history"
    And Validate JSON Schema student transaction
    Examples:
      | page | limit |
      |  1    |   100     |
      |  5    |   50     |

  @Musiclab @NegativeCase @GetALL @Student
  Scenario Outline: Get students transactions with invalid params
    Given User login student with account
    And Get students transactions with invalid parameter <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 400 Bad Request
    And Validate responses body for message should be "invalid page parameter"
    And Validate Json Schema student invalid params
    Examples:
      | page | limit |
      |  ee   |   bb     |
      |  xx    |   PUBG    |
  @Musiclab @NegativeCase @GetALL @Student
  Scenario Outline: Get students transactions with empty value params
    Given User login student with account
    And Get students transactions with empty value params <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      |    |       |
