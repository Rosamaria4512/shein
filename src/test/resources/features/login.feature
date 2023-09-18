Feature: Login

  Scenario: Login succesfully

    Given he user enter a the website
    When he user enter with credentials
      | email                     | password |
      | rmquilindo8@misena.edu.co | K7!5o*if |
    Then he could succesfully
  #