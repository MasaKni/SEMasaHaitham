package Test_Package;

import static org.junit.Assert.assertTrue;

import Main_Package.Book;
import Main_Package.Books_Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
    boolean found=false;
    int div=0;
    String sub="";
    Books_Library  library= new Books_Library();

    @Given("Users not logged")
    public void users_not_logged() 
    {
      System.out.println("user not logged in");
    }

    @When("User enters Substring of valid Title {string}")
    public void user_enters_substring_of_valid_title(String string) 
    {
	  div=string.length();
	
	  for (Book book:library.Books)
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
	  assertTrue(found==true);
	  div=string.length();
	  for (Book book:library.Books)
	   {
		  if (book.getTitle().length()>=div)
		  { 
			 sub=book.getTitle().substring(0, div);		
			 if (sub.equalsIgnoreCase(string) ) 
				 System.out.println(book.getTitle()+"---"+book.getAuthor()+"---"+book.getISBN() );
		  }
       }
    }

    @When("User enters Substring of valid Author {string}")
    public void user_enters_substring_of_valid_author(String string) 
    {
    	div=string.length();
    	
  	  for (Book book:library.Books)
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
      assertTrue(found==true);
  	  div=string.length();
  	  for (Book book:library.Books)
  	   {
  		 if (book.getAuthor().length()>=div)
		    { 
	  		    sub=book.getAuthor().substring(0, div);		
	  		 if (sub.equalsIgnoreCase(string) ) 
	  			 System.out.println(book.getTitle()+"---"+book.getAuthor()+"---"+book.getISBN() );
	         }
  		}
    }
    
    @When("User enters Substring of valid ISBN {string}")
    public void user_enters_substring_of_valid_isbn(String string)
    {
  	  div=string.length();
  	  for (Book book:library.Books)
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
    	  assertTrue(found==true);
    	  div=string.length();
    	  for (Book book:library.Books)
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
