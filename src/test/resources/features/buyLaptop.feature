Feature: BuyLaptop
  i need buy a Laptod

  Scenario: Buy Laptod successfull
    Given he user enter a the website
    When the user select a product and the agregate a carrito for buy an complete the form
      | name          | country  | city    | Target     | month | year |
      | Andres felipe | Colombia | Popayan | 3535455656 | Mayo  |2023  |
    Then the user see his dates and his product

  Scenario: Agregate Laptod successfull
    Given he user enter a the website
    When the user select a product and the agregate a carrito
    Then the user see his product

    Scenario: Eliminate a product
      Given he user enter a the website
      When the user select a product and the agregate a carrito for delete
      Then the user see that not there is products


