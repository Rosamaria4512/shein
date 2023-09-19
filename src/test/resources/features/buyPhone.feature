Feature: Buy a Phone
  i need buy a phone
  Scenario: Agregate Phone Successfull
    Given he user enter a the website
    When the user select a phone and go to carrito
    Then the user will see his phone

  Scenario: Eliminate a product
    Given he user enter a the website
    When the user select a phone and the agregate a carrito for delete
    Then the user see that not there is the phone
