Feature: Buy a Monitor
  i need buy a phone
  Scenario: Buy Monitor Successfull
    Given he user enter a the website
    When the user select a Monitor and go to carrito
    Then the user will see his monitor

 Scenario: Eliminate a product
   Given he user enter a the website
   When the user select a monitor and the agregate a carrito for delete
    Then the user see that not there is the Monitor
