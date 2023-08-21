Feature: Delete Mentor
#
#  @Musiclab @PositiveCase @Mentor
#  Scenario: Delete a class with valid path
#    Given User login mentor with account
#    When  Delete mentor with valid path
#    And   Send DELETE request for delete mentor
#    Then  Status code should be 200 OK
#    And   Validate delete class using valid path with json schema validator

  @Musiclab @NegativeCase @Mentor
  Scenario: Delete with invalid path
    Given User login mentor with account
    When  Delete mentor with invalid path
    And   Send DELETE request for delete mentor with invalid path
    Then  Status code should be 404 Not Found
    And   Validate delete mentor using invalid path with json schema validator




