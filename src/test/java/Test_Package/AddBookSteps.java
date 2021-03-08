package Test_Package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Main_Package.Book;
import Main_Package.Books_Library;
import static org.junit.Assert.assertTrue;

public class AddBookSteps {
	boolean Added=false;
    Books_Library library = new Books_Library();
    @Given("the administrator is logged in")
    public void the_administrator_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(" the administrator is logged in ");
    }

    @When("the user enter the {string} , the {string} and the {string}")
    public void the_user_enter_the_the_and_the(String title, String author, String isbn) {
        library.addBook(title,author,isbn);
        Added=true;
    }

    @Then("the book will be added")
    public void the_book_will_be_added() {
    	  assertTrue(Added == true);
    	  for (Book book:library.Books)
    			  {
    	  System.out.println(book.getAuthor());}
    }

    @Given("the administrator is not logged in")
    public void the_administrator_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(" the administrator is not logged in ");
    }

    @When("the user enter the {string} , the {string} and the {string} and he is not logged in")
    public void the_user_enter_the_the_and_the_and_he_is_not_logged_in(String string, String string2, String string3) {

    }


    @Then("the book will not be added")
    public void the_book_will_not_be_added() {
  
			  assertTrue(Added == false);
			 
    }


}
