Feature: Put Update Mentor Class

  @Musiclab @PositiveCase @PutUpdateClass @Mentor
  Scenario Outline:Put update mentor class with valid request body
    Given User login mentor with account
    When  Put update mentor class with valid request body using valid path <id>
    And   Send request put for update mentor class
    Then  Status code should be 201 Created
    And   Validate put update mentor class with json schema validator
    Examples:
      | id |
      | 4  |

  @Musiclab @PositiveCase @PutUpdateClass @Mentor
  Scenario Outline:Put update mentor class with invalid request body
    Given User login mentor with account
    When  Put update mentor class with invalid request body using valid path <id>
    And   Send request put for update mentor class
    Then  Status code should be 400 Bad Request
    And   Validate put update mentor class using invalid request body with json schema validator
    Examples:
      | id |
      | 4  |

  @Musiclab @PositiveCase @PutUpdateClass @Mentor

  Scenario Outline:Put update mentor class with invalid path
    Given User login mentor with account
    When  Put update mentor class with valid request body using invalid path <id>
    And   Send request put for update mentor class
    Then  Status code should be 400 Bad Request
    And   Validate put update mentor class using invalid path with json schema validator

    Examples:
      | id |
      | 2x |