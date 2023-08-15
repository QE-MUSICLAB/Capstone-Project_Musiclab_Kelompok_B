Feature: Get mentor transaction

  Scenario Outline: Get mentor transactions with valid parameter page
    Given User login mentor with account
    And Get mentor transactions with valid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 200 OK
    Examples:
      | page | limit |
      | 1    | 100    |
      | 5    | 20     |


  Scenario Outline: Get mentor transactions with invalid parameter page and limit
    Given User login mentor with account
    And Get mentor transactions with invalid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      | @   | JHO    |
      | @@    | JU     |

  Scenario Outline: Get mentor transactions with empty value
    Given User login mentor with account
    And Get mentor transactions with empty value parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      |      |        |
# Student Transaction
  Scenario Outline: Get students transactions with valid params
    Given User login student with account
    And Get students transactions with valid parameter <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 200 OK
    Examples:
      | page | limit |
      |  1    |   100     |
      |  5    |   50     |

  Scenario Outline: Get students transactions with invalid params
    Given User login student with account
    And Get students transactions with invalid parameter <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      |  ee   |   bb     |
      |  xx    |   PUBG    |

  Scenario Outline: Get students transactions with empty value params
    Given User login student with account
    And Get students transactions with empty value params <page> <limit>
    When Send GET request for students transactions
    Then Status code should be 400 Bad Request
    Examples:
      | page | limit |
      |    |       |
