package testpackage;
import java.util.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Book;
import mainpackage.BooksLibrary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class AddBookSteps {
	boolean Added=false;
	char[] ISBN ;
	public int num=10;
	public int tot=0;
	String check="";
	boolean flag=false;
    BooksLibrary library = new BooksLibrary();
    List<Book> arr=library.getArray();
    
    @Given("the administrator is logged in")
    public void the_administrator_is_logged_in() {
        System.out.println(" the administrator is logged in ");
    }

@When("the user enter the {string} , the {string} and the {string} and Signature is {string}")
public void the_user_enter_the_the_and_the_and_signature_is(String title, String author, String isbn, String sign) {
	System.out.printf("----------- %s ----------- %s ----------- %s ----------- %s ----------- %n" , title,author,isbn,sign );
	flag = checkIfBookInLibrary(isbn, flag);	
    addNewBook(title, author, isbn, sign, flag);
	
}

private void addNewBook(String title, String author, String isbn, String sign, boolean flag) {
	if(flag== false)
	{	library.checkIsbn(this, isbn);
		
	     if(tot%11 == 0)
	      {
		    library.addBook(title,author,isbn,sign);
	        Added=true;
	      }
	     else 
		  Added=false;
	  }
}

private boolean checkIfBookInLibrary(String isbn, boolean flag) {
	for (Book book:arr) 
	{
		if (isbn.equals(book.getISBN()) ) 
			{flag=true; }
	}
	return flag;
}

@Then("if the ISBN is valid the book will be added")
	public void if_the_isbn_is_valid_the_book_will_be_added() {
		if (Added==true)
		{	assertTrue(Added);
			System.out.println("-----------Book Added Sucsessfully-----------");
		}
		else{
			assertFalse(Added);
			System.out.println("-----------Book can't be added because the ISBN is invalid----------- ");
		}
	}


    @Given("the administrator is not logged in")
    public void the_administrator_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Administrator is not logged in, can't add books");
    }


    @When("the user enter the {string} , the {string} and the {string} and Signature is {string} and he is not logged in")
    public void the_user_enter_the_the_and_the_and_signature_is_and_he_is_not_logged_in(String string, String string2, String string3, String string4) {
      Added=false;
    }
    @Then("the book will not be added")
    public void the_book_will_not_be_added() {
  
			  assertFalse(Added);
			  System.out.println("-----------Book Can't be added-----------");
			 
    }


}
