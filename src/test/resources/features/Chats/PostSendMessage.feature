Feature:Post Send Message

  @Musiclab @PositiveCase @PostMentor @Chats
  Scenario: Post mentor send message to student with valid id
    Given User login mentor with account
    And Post mentor send message to student with valid json
    When Send request mentor send message to student
    Then Status code should be 201 Created

  @Musiclab @NegativeCase @PostMentor @Chats
  Scenario: Post mentor send message to student with invalid mentor id
    Given User login mentor with account
    And Post mentor send message to student with invalid json and mentor id
    When Send request mentor send message to student
    Then Status code should be 400 Bad Request

  @Musiclab @NegativeCase @PostMentor @Chats
  Scenario: Post mentor send message to student with invalid student id
    Given User login mentor with account
    And Post mentor send message to student with invalid json and student id
    When Send request mentor send message to student
    Then Status code should be 400 Bad Request

  @Musiclab @NegativeCase @PostMentor @Chats
  Scenario: Post mentor send message to student with invalid path
    Given User login mentor with account
    And Post mentor send message to student with valid json
    When Send request mentor send message to student with invalid path
    Then Status code should be 404 Not Found

  @Musiclab @PositiveCase @PostStudent @Chats
  Scenario: Post student send message to mentor with valid id
    Given User login student with account
    And Post student send message to mentor with valid json
    When Send request student send message to mentor
    Then Status code should be 201 Created

  @Musiclab @NegativeCase @PostStudent @Chats
  Scenario: Post student send message to mentor with invalid student id
    Given User login student with account
    And Post student send message to mentor with invalid json and student id
    When Send request student send message to mentor
    Then Status code should be 400 Bad Request

  @Musiclab @NegativeCase @PostStudent @Chats
  Scenario: Post student send message to mentor with invalid mentor id
    Given User login student with account
    And Post student send message to mentor with invalid json and mentor id
    When Send request student send message to mentor
    Then Status code should be 400 Bad Request

  @Musiclab @NegativeCase @PostStudent @Chats
  Scenario: Post student send message to mentor with invalid path
    Given User login student with account
    And Post student send message to mentor with valid json
    When Send request student send message to mentor with invalid path
    Then Status code should be 404 Not Found