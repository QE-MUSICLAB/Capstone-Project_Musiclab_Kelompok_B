Feature: Get mentor top week

  @Musiclab @PositiveCase @Mentor
  Scenario:Get mentor top week with valid path
      Given Get mentor top week with valid path
      When  Send request get for get mentor top week
      Then  Status code should be 200 OK
      And   Validate get mentor top week with json schema validator

  @Musiclab @NegativeCase @Mentor
  Scenario:Get mentor top week with invalid path
    Given Get mentor top week with invalid path
    When  Send request get for get mentor top week with invalid path
    Then  Status code should be 400 Bad Request
    And   Validate get mentor top week using invalid path with json schema validator




