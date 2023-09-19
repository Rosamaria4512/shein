Feature: BuyLaptop
  i need buy a Laptod

  Scenario: Buy Laptod successfull
    Given he user enter a the website
    When the user select a product and the agregate a carrito
    Then the user see his product

    Scenario: Eliminate a product
      Given he user enter a the website
      When the user select a product and the agregate a carrito for delete
      Then the user see that not there is products
