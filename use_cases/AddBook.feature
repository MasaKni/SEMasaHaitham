Feature: Add Book

  Scenario Outline: Add a book when the administrator is logged in
    Given the administrator is logged in
    When the user enter the "<title>" , the "<author>" and the "<ISBN>"
    Then the book will be added
    Examples:
      | title    | author  | ISBN  |
      | math     | haytham | 1234454857   |
      | physics  | masa    | 1234544444 |
      | software | hayasam | 1286561888    |


  Scenario Outline: Add a book when the administrator is not logged in
    Given the administrator is not logged in
    When  the user enter the "<title>" , the "<author>" and the "<ISBN>" and he is not logged in
    Then the book will not be added
    Examples:
      | title    | author  | ISBN  |
      | math     | mahmood | 1238498888   |
      | physics  | masa    | 1234544444 |
      | software | hayasam | 1254541547    |