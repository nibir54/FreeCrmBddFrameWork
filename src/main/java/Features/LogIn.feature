Feature: Facebook login feature

  Scenario: Facebook login Test Scenario
    Given user is already on login page
    When title of login page is Facebook
    Then User enters username and password
    Then User clicks on login button
    