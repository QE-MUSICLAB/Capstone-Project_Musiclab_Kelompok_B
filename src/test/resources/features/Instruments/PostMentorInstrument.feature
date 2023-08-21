Feature:Post Mentor Instrument

  @Musiclab @PositiveCase @PostInstrument @Mentor
  Scenario: Post mentor instrument with valid data
    Given User login mentor with account
    And Post mentor instrument with valid json
    When Send request post mentor instrument
    Then Status code should be 201 Created

  @Musiclab @NegativeCase @PostInstrument @Mentor
  Scenario: Post mentor instrument with invalid data
    Given User login mentor with account
    And Post mentor instrument with invalid json
    When Send request post mentor instrument
    Then Status code should be 400 Bad Request
    And Validate response body message "error bind data"

  @Musiclab @NegativeCase @PostInstrument @Mentor
  Scenario: Post mentor instrument with invalid path
    Given User login mentor with account
    And Post mentor instrument with valid json
    When Send request post mentor instrument with invalid path
    Then Status code should be 405 Method Not Allowed