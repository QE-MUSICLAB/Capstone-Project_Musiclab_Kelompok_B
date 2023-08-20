Feature:Get All Chat

  @MusicLab @PositiveCase @GetMentor @Chats
  Scenario Outline: Get all chat with valid path
    Given User login mentor with account
    And Get all chat with valid <mentor_id> as mentor_id and <student_id> as student_id
    When Send request get all chat
    Then Status code should be 200 OK
    Examples:
      | mentor_id | student_id |
      | 39        | 5          |

  @MusicLab @NegativeCase @GetMentor @Chats
  Scenario Outline: Get all chat with invalid path
    Given User login mentor with account
    And Get all chat with invalid "<mentor_id>" as mentor_id and "<student_id>" as student_id
    When Send request get all chat
    Then Status code should be 500 Internal Server Error
    Examples:
      | mentor_id | student_id |
      | tiga      | tujuh      |