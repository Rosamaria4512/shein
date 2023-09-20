Feature: Buy a Monitor
  i need buy a phone

  Scenario: Buy Monitor successfull
    Given he user enter a the website
    When the user select a product and the agregate a carrito for buy an complete the form
      | name          | country  | city    | Target     | month | year |
      | Robinson Truque | Brasil | Sao Pablo | 12344 | Diciembre  |2012  |
    Then the user see his dates and his product

  Scenario: Agregate Monitor Successfull
    Given he user enter a the website
    When the user select a Monitor and go to carrito
    Then the user will see his monitor

 Scenario: Eliminate a product
   Given he user enter a the website
   When the user select a monitor and the agregate a carrito for delete
    Then the user see that not there is the Monitor
