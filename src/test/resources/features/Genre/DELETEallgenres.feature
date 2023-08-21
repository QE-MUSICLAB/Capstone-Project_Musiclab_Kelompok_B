Feature:  Delete all genres mentor

#  @Musiclab @PositiveCase @Genre
#  Scenario: Delete all genress mentor with valid params
#    Given User login mentor with account
#    When Delete mentor with valid paramater id 2
#    And request for delete mentor genre
#    Then Status code should be 200 OK
#    And Validate response body delete message should be "success delete mentor genre"
#    And Validate message delete JSON Schema


  @Musiclab @NegativeCase @Genre
  Scenario: Delete all genress mentor with invalid params
    Given User login mentor with account
    When Delete mentor with invalid paramater id lima
    And request for delete mentor genre with invalid params
    Then Status code should be 400 Bad Request
    And Validate message invalid delete JSON Schema
