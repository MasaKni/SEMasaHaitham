package Test_Package;

import static org.junit.Assert.assertTrue;

import mainpackage.Book;
import mainpackage.BooksLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
    boolean found=false;
    int div=0;
    String sub="";

    @Given("User logged in or not")
    public void User_logged_in_or_not() 
    {
      System.out.println("Search book");
    }

    @When("User enters Substring of valid Title {string}")
    public void user_enters_substring_of_valid_title(String string) 
    {
    	System.out.printf("----------- %s ----------- %n" , string );

	  div=string.length();
	
	  for (Book book: BooksLibrary.books2)
	   {
		  if (book.getTitle().length()>=div)
		  { 
			  sub=book.getTitle().substring(0, div);
			 if (sub.equalsIgnoreCase(string)) 
			  found=true;
	          }
		  }
    }

    @Then("show book information for books with Title {string}")
    public void show_book_information_for_books_with_title(String string) 
    {
    	 if (found==false) 
    	 {   
	   		 assertTrue(!found);
	   		 System.out.println("No book found with such "+'"'+string+'"');
   	     } 
	   	 else	  
	   	 {
		      assertTrue(found);
			  div=string.length();
			  for (Book book: BooksLibrary.books2)
			   {
				  if (book.getTitle().length()>=div)
				  { 
					 sub=book.getTitle().substring(0, div);		
					 if (sub.equalsIgnoreCase(string) ) 
						 System.out.println(book.getTitle()+"---"+book.getAuthor()+"---"+book.getISBN() );
				  }
		       }
	   	 }
    }

    @When("User enters Substring of valid Author {string}")
    public void user_enters_substring_of_valid_author(String string) 
    {
    	System.out.printf("----------- %s ----------- %n" , string );

    	div=string.length();
    	
  	  for (Book book: BooksLibrary.books2)
  	   {
  		 if (book.getAuthor().length()>=div)
		    { 
	  		 sub=book.getAuthor().substring(0, div);
	  		 if (sub.equalsIgnoreCase(string)) 
	  		  found=true;
	  	    }
         }
    }

    @Then("show book information for books with Author {string}")
    public void show_book_information_for_books_with_author(String string)
    {
    	 if (found==false) 
    	  {   
	   		 assertTrue(!found);
	   		 System.out.println("No book found with such "+'"'+string+'"');
   	      } 
	   	 else	  
	   	 {
		      assertTrue(found);
		  	  div=string.length();
		  	  for (Book book: BooksLibrary.books2)
		  	   {
		  		 if (book.getAuthor().length()>=div)
				    { 
			  		    sub=book.getAuthor().substring(0, div);		
			  		 if (sub.equalsIgnoreCase(string) ) 
			  			 System.out.println(book.getTitle()+"---"+book.getAuthor()+"---"+book.getISBN() );
			         }
		  		}
	   	 }
    }
    
    @When("User enters Substring of valid ISBN {string}")
    public void user_enters_substring_of_valid_isbn(String string)
    {
    	System.out.printf("----------- %s ----------- %n" , string );

  	  div=string.length();
  	  for (Book book: BooksLibrary.books2)
  	   {
  		 if (book.getISBN().length()>=div)
		    { 
	  		 sub=book.getISBN().substring(0, div);
	  		 if (sub.equalsIgnoreCase(string)) 
	  		  found=true;
	  		 }
  	   }
  	 
    }

    @Then("show book information for books with ISBN {string}")
    public void show_book_information_for_books_with_isbn(String string)
    {
    	 if (found==false) 
     	  {   
    		 assertTrue(!found);
    		 System.out.println("No book found with such "+'"'+string+'"');
    	  } 
    	 else	  
    	 {
	    	  assertTrue(found);
	    	  div=string.length();
	    	  for (Book book: BooksLibrary.books2)
	    	   {
	    		  if (book.getISBN().length()>=div)
	  		      { 
		    		 sub=book.getISBN().substring(0, div);		
		    		 if (sub.equalsIgnoreCase(string) ) 
		    			 System.out.println(book.getTitle()+"---"+book.getAuthor()+"---"+book.getISBN() );
	  		      }
	    		}
    	 }
    }
}
