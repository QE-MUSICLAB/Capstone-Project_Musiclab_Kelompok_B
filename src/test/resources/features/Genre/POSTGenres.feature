Feature:  POST genres

  @Musiclab @PositiveCase @PostALL @Mentor @Genre
  Scenario: POST mentor genress with valid request body
    Given User login mentor with account
    When Post mentor genress with valid request body
    And request mentor genress with valid request body
    Then Status code should be 201 Created
    And Validate response body mentor genress message "success add mentor genre"
    And Validate message JSON Schema mentor genress

  @Musiclab @NegativeCase @PostALL @Mentor @Genre
  Scenario: POST mentor genress with invalid request body
    Given User login mentor with account
    When Post mentor genress with invalid request body
    And request mentor genress with invalid request body
    Then Status code should be 400 Bad Request
    And Validate response invalid body mentor genress message "input format incorrect"
    And Validate message JSON Schema invalid mentor genress