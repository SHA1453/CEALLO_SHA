Feature: Library app login feature
  User Story:
  As a user, I should be able to login with correct credentials. And homepage should be displayed.

  @wip
  Scenario: Login functionality
    Given user is on the login page
    When user enters username
    And user enters  password
    Then user should see the dashboard