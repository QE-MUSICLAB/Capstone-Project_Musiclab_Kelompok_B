Feature: Get mentor transaction

  Scenario Outline: Get mentor transactions with valid parameter page
    Given User login mentor with account
    And Get mentor transactions with valid parameter <page> <limit>
    When Send GET request for mentor transactions
    Then Status code should be 200 OK
    Examples:
      | page | limit |
      | 1    | 9     |
      | 2    | 2     |