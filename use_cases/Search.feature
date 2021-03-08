Feature:  Search Books
Background: 
Given User logged in or not
  Scenario Outline: Search by title
   When  User enters Substring of valid Title "<title>" 
   Then show book information for books with Title "<title>"
   Examples:
      |title|
      |The Cruel Prince|
      |The|
      |software| 
   Scenario Outline: Search by author
   When  User enters Substring of valid Author "<author>" 
   Then show book information for books with Author "<author>"
   Examples:
      |author|
      |Holly|
      |Cassandra|
      |masa| 
      
   Scenario Outline: Search by ISBN
   When  User enters Substring of valid ISBN "<ISBN>" 
   Then show book information for books with ISBN "<ISBN>"
   Examples:
      |ISBN|
      |0143038419|
      |031631031X|
      |0143| 
      