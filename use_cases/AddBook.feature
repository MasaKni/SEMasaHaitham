Feature: Add Book

  Scenario Outline: Add a book when the administrator is logged in
    Given the administrator is logged in
    When  the user enter the "<title>" , the "<author>" and the "<ISBN>" and Signature is "<Sig>"
    Then if the ISBN is valid the book will be added
    Examples:
      |title            |author            |ISBN         |Sig|
      |Eat Pray Love    |Elizabeth Gilbert |0140449116  |Elizabeth2007|
      |The Signature of All Things|Elizabeth Gilbert|0143125842|Elizabeth2014|
     |The Cruel Prince |Holly Black       | 0198534531   |Holly2018|
     | software | masa | 0198534531 |Masa2020  |
      |Test-Drivenest Driven Development: By Example |Kent Beck| 9780321146  | Beck2002|
      
#  Scenario Outline: Wrong isbn format
#    Given the administrator is logged in
#    When  the user enter the "<title>" , the "<author>" and the "<ISBN>" and Signature is "<Sig>"
#    Then the book will not be added
#    Examples:
#      |title            |author            |ISBN         |Sig|
#      |Test-Drivenest Driven Development: By Example |Kent Beck| 9780321146  | Beck2002|
      

  Scenario Outline: Add a book when the administrator is not logged in
    Given the administrator is not logged in
    When  the user enter the "<title>" , the "<author>" and the "<ISBN>" and Signature is "<Sig>" and he is not logged in
    Then the book will not be added
    Examples:
      | title    | author  | ISBN  |
      | math     | mahmood | 1238498888   |
      | physics  | masa    | 1234544444 |
      | software | hayasam | 1254541547    |