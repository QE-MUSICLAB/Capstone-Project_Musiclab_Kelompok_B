Feature: Get mentor profile by id

  @Musiclab @PositiveCase @Mentor
  Scenario:Get mentor profile with valid path
    Given  Get mentor profile with valid path id 39
    When   Send request get for mentor profile valid path
    Then   Status code should be 200 OK
    And    Validate get mentor using valid path with json schema validator


  @Musiclab @NegativeCase @Mentor
  Scenario Outline: Get mentor profile with invalid id path special character
    Given Get mentor profile with invalid id path special character <character>
    When  Send request get for get mentor profile with special character
    Then  Status code should be 400 Bad Request
    And   Validate get mentor profile by id using invalid path with json schema validator
    Examples:
      | character |
      | @@@       |

  @Musiclab @NegativeCase  @Mentor
  Scenario:Get mentor profile with unavailable path
    Given  Get mentor profile with unavailable path id 111111
    When   Send request get for mentor profile unavailable path
    Then   Status code should be 404 Not Found
    And    Validate get mentor profile by id with json schema validator