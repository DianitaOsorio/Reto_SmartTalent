Feature: fill out the form fields

  Background:
    Given that the user opens the URL to see the login page
    When Click on the connect appointment button
    And  write the following data
      | user     | password           |
      | John Doe | ThisIsNotAPassword |

  Scenario:the user is on the page

    Given the user enters the form
    When fill out the form fields
    Then The user views the appointment successfully



