Feature: Contact
  i need send a messagge
  Scenario: Send Message Successfult
    Given he user enter a the website
    When the user select the option Contact and complete the form
      | email_receptor     | dates_user                        | messagge                                                    |
      | andres54@gmail.com | Estos son mis datos y mi contacto | Hola este es un mensaje mandado desde una automatizacion :) |
    Then the use will send the message