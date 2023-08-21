Feature:Get List Instruments by Mentor Id

  @MusicLab @PositiveCase @GetInstrument @Mentor
  Scenario Outline: Get list instruments with valid parameter
    Given User login mentor with account
    And Get list instruments with valid mentor id <mentor_id>
    When User send request list instruments by mentor id
    Then Status code should be 200 OK
    And Validate get list instruments by mentor id schema
    Examples:
      | mentor_id |
      | 39        |

  @MusicLab @NegativeCase @GetInstrument @Mentor
  Scenario Outline: Get list instruments with invalid parameter
    Given User login mentor with account
    And Get list instruments with invalid mentor id "<mentor_id>"
    When User send request list instruments by mentor id
    Then Status code should be 400 Bad Request
    Examples:
      | mentor_id |
      | tiga      |

  @MusicLab @NegativeCase @GetInstrument @Mentor
  Scenario Outline: Get list instruments with empty parameter
    Given User login mentor with account
    And Get list instruments with empty mentor id <mentor_id>
    When User send request list instruments by mentor id
    Then Status code should be 400 Bad Request
    Examples:
      | mentor_id |
      |           |