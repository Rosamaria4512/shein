Feature: Register

  Scenario: Register in the website

    Given he user enter a the website
    When he user register a the website
      | user   | password |
      | andres | andres   |
    Then he user registered correctly
  #