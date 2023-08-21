Feature:Get List Instruments

  @Musiclab @PositiveCase @GetAll @Instruments
  Scenario: Get list instruments with valid path
    Given Get list instruments data
    When User send request get list instruments with valid path
    Then Status code should be 200 OK
    And Validate get list instruments schema

  @Musiclab @NegativeCase @GetAll @Instruments
  Scenario: Get list instruments with invalid path
    Given Get list instruments data
    When User send request get list instruments with invalid path
    Then Status code should be 404 Not Found