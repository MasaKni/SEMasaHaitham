Feature:Add Book

  Scenario Outline: Add a book when the administrator is logged in
    Given the administrator is logged in
    When the user enter the "<title>" , the "<author>" and the "<ISBN>"
    Then the book will be added
    Examples:
      | title    | author  | ISBN  |
      | math     | haytham | 123   |
      | physics  | masa    | 12345 |
      | software | hayasam | 12    |


  Scenario Outline: Add a book when the administrator is not logged in
    Given the administrator is not logged in
    When  the user enter the "<title>" , the "<author>" and the "<ISBN>" and he is not logged in
    Then the book will not be added
    Examples:
      | title    | author  | ISBN  |
      | math     | haytham | 123   |
      | physics  | masa    | 12345 |
      | software | hayasam | 12    |