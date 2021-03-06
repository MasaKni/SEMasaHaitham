Feature: login
  Scenario: login with valid credentials
    Given the username is "haytham" and the password is "1234"
    When I fill in the username "haytham"
    And  I fill in the password "1234"
    Then the user should be logged in


  Scenario: login with invalid credentials
    Given the username is "haytham" and the password is "1234"
    When I fill in the username "haytham"
    And  I fill in the password "123"
    Then the user should not be logged in
