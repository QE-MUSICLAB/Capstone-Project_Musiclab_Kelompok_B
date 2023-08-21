Feature: Post Create Credentials

  @Musiclab @PositiveCase @Mentor
  Scenario Outline: Post create Credentials with valid request body
    Given User login mentor with account
    When  Post create user with certificate_file "<certificate_file>", type is "<type>",name is "<name>"
    And   Send request body for create mentor credentials
    Then  Status code should be 201 Created
    Examples:
      | certificate_file                     | type          | name        |
      | f4b8784e0ef2352f6e897fa08baeafbe.jpg | International | Bass Master |

  @Musiclab @PositiveCase @Mentor
  Scenario Outline: Post create Credentials with invalid request body
    Given User login mentor with account
    When  Post create user with certificate_file "<certificate_file>", type is "<type>",name is "<name>"
    And   Send request body for create mentor credentials
    Then  Status code should be 400 Bad Request
    Examples:
      | certificate_file                                         | type           | name        |
      | 20th-Anniversary-Jack-Casady-Bass-Jefferson-Airplane.jpg | ssssssssssssss | sssssssssss |


  @Musiclab @PositiveCase @Mentor
  Scenario Outline: Post create Credentials with empty type
    Given User login mentor with account
    When  Post create user with certificate_file "<certificate_file>", type is "<type>",name is "<name>"
    And   Send request body for create mentor credentials
    Then  Status code should be 400 Bad Request
    Examples:
      | certificate_file                                         | type | name        |
      | 20th-Anniversary-Jack-Casady-Bass-Jefferson-Airplane.jpg |      | Bass Master |

  @Musiclab @PositiveCase @Mentor
  Scenario Outline: Post create Credentials with empty name
    Given User login mentor with account
    When  Post create user with certificate_file "<certificate_file>", type is "<type>",name is "<name>"
    And   Send request body for create mentor credentials
    Then  Status code should be 400 Bad Request
    Examples:
      | certificate_file                                         | type          | name |
      | 20th-Anniversary-Jack-Casady-Bass-Jefferson-Airplane.jpg | International |      |

  @Musiclab @PositiveCase @Mentor
  Scenario Outline: Post create Credentials with empty type and empty name
    Given User login mentor with account
    When  Post create user with certificate_file "<certificate_file>", type is "<type>",name is "<name>"
    And   Send request body for create mentor credentials
    Then  Status code should be 400 Bad Request
    Examples:
      | certificate_file                                         | type | name |
      | 20th-Anniversary-Jack-Casady-Bass-Jefferson-Airplane.jpg |      |      |




