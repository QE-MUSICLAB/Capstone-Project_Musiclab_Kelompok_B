Feature: Get mentors transaction

  @Tugas
 Scenario Outline: Get mentors transactions with valid params
    Given User login mentor with account
    When mentor transactions with valid parameter <page> <limit>
    And Get request for mentor transactions
    Then Status code should be 404 Not Found
    And Validate response body for message should be "success show mentor transaction history"
    And Validate JSON Schema make mentor transactions
    Examples:
    |page| limit|
    |1   | 100  |
    |5   | 20   |
