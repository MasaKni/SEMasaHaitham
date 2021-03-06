Feature: logout
  Scenario: logout when you are already logged in
    Given  the user is logged in
    When  the user press logout
    Then  the user should be logged out