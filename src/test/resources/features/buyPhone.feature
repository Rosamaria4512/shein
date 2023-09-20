Feature: Buy a Phone
  i need buy a phone

  Scenario: Buy Phone successfull
    Given he user enter a the website
    When the user select a product and the agregate a carrito for buy an complete the form
      | name          | country  | city    | Target     | month | year |
      | Rosa Camila | Japon | Kioto | 664646575 | Enero  |2000  |
    Then the user see his dates and his product

  Scenario: Agregate Phone Successfull
    Given he user enter a the website
    When the user select a phone and go to carrito
    Then the user will see his phone

  Scenario: Eliminate a product
    Given he user enter a the website
    When the user select a phone and the agregate a carrito for delete
    Then the user see that not there is the phone
