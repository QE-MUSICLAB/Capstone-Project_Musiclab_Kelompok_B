Feature: Delete Mentor Instrument

#  @Musiclab @PositiveCase @DeleteInstrument @Mentor
#  Scenario Outline: Delete mentor instrument with valid parameter id
#    Given User login mentor with account
#    And Delete instrument with valid id <id>
#    When User send request delete instrument
#    Then Status code should be 200 OK
#    Examples:
#      | id |
#      | 1  |

  @Musiclab @NegativeCase @DeleteInstrument @Mentor
  Scenario Outline: Delete mentor instrument with invalid parameter id
    Given User login mentor with account
    And Delete instrument with invalid id "<id>"
    When User send request delete instrument
    Then Status code should be 400 Bad Request
    Examples:
      | id   |
      | satu |

  @Musiclab @NegativeCase @DeleteInstrument @Mentor
  Scenario Outline: Delete mentor instrument with empty parameter id
    Given User login mentor with account
    And Delete instrument with empty id <id>
    When User send request delete instrument
    Then Status code should be 405 Method Not Allowed
    Examples:
      | id |
      |    |