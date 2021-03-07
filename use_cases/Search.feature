Feature:  Search Books
  Scenario Outline: Search by title
   Given  Users not logged
   When  User enters Substring of valid Title "<title>" 
   Then show book information for books with Title "<title>"
   Examples:
      |title|
      |The Signature of All Things|
      |The| 
   Scenario Outline: Search by author
   Given  Users not logged
   When  User enters Substring of valid Author "<author>" 
   Then show book information for books with Author "<author>"
   Examples:
      |author|
      |Holly |
      |Cassandra|
      |Eliz| 
      
   Scenario Outline: Search by ISBN
   Given  Users not logged
   When  User enters Substring of valid ISBN "<ISBN>" 
   Then show book information for books with ISBN "<ISBN>"
   Examples:
      |ISBN|
      |0143038419|
      |031631031X|
      |0143| 
      