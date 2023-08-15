Feature: Get All Mentor

  @Musiclab @PositiveCase @GetAll @Mentor
  Scenario:Get all mentor with valid path
    Given Get all mentor with valid path
    When  Send request get for all mentor
    Then  Status code should be 200 OK
    And   Validate Get all mentor with json schema validator

  @Musiclab @NegativeCaseCase @GetAll @Mentor
  Scenario:Get all mentor with invalid path
    Given  Get all mentor with invalid path
    When   Send request get for all mentor with invalid path
    Then   Status code should be 404 Not Found
    And    Validate Get all mentor using invalid path with json schema validator


  @Musiclab @NegativeCaseCase @GetAll @Mentor
  Scenario:Get all mentor Get all mentor without path
    Given   Get all mentor Get all mentor without path
    When    Send request Get for get all mentor Get all mentor without path
    Then    Status code should be 404 Not Found
    And     Validate Get all mentor using without path with json schema validator
