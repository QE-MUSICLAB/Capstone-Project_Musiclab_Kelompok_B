Feature: Show all mentor genres

  @Musiclab @PositiveCase @GetALL @Mentor
  Scenario: Get all genres mentor with valid id
    Given User login mentor with account
    When show all genress with valid paramater mentor id 15
    And send request mentors all genres
    Then Status code should be 200 OK
    And Validate response body message should be "success show all genres"
    And validate mentors all genres JSON Schmea

  @Musiclab @NegativeCase @GetALL @Mentor
  Scenario: Get all genres mentor with invalid params
    Given User login mentor with account
    When show all genress with invalid paramater mentor
    And send request mentors all genres with invalid params
    Then Status code should be 404 Not Found
    And Validate response invalid params message should be "data not found"
    And validate invalid params mentors all genres JSON Schema

  @Musiclab @NegativeCase @GetALL @Mentor
  Scenario: Get all genres mentor with invalid id
    Given User login mentor with account
    When show all genress with invalid id mentor
    And send request mentors all genres with invalid id
    Then Status code should be 400 Bad Request
    And Validate response invalid id message should be "id param must number"
    And validate invalid id mentors all genres JSON Schema