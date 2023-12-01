Feature: Sign in to schedule an appointment

  @login
  Scenario Outline: The user logs in and schedules an appointment

    Given that the user opens the URL to see the login page
    When Click on the connect appointment button
    And  write the following data
      | user   | password   |
      | <user> | <password> |
    Then the user can see the text <text>
    Examples:
      | user     | password           | text            |
      | John Doe | ThisIsNotAPassword | Make Appointment |
