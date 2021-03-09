package Test_Package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Main_Package.Book;
import Main_Package.Books_Library;
import static org.junit.Assert.assertTrue;
import Main_Package.Books_Library;
public class AddBookSteps {
	boolean Added=false;
	char[] ISBN ;
	int num=10;
	int tot=0;
	String check="";
     Books_Library library = new Books_Library();
     
    @Given("the administrator is logged in")
    public void the_administrator_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(" the administrator is logged in ");
    }

@When("the user enter the {string} , the {string} and the {string} and Signature is {string}")
public void the_user_enter_the_the_and_the_and_signature_is(String title, String author, String isbn, String sign) {
	System.out.printf("----------- %s ----------- %s ----------- %s ----------- %s ----------- %n" , title,author,isbn,sign );
	boolean flag=false;
	for (Book book:Books_Library.Books) 
	{
		if (isbn.equals(book.getISBN()) ) 
			{flag=true; }
	}	
		if(flag== false)
		{	for (int j = 0; j <= isbn.length() - 1; j++) 
		     { 
			  if (Character.getNumericValue(isbn.charAt(j))>= 0|| Character.getNumericValue(isbn.charAt(j))<= 9)
			    {
				  tot+=Character.getNumericValue(isbn.charAt(j)) *num;
				  num--;
			    }
			  else 
				{
				  Added= false;
				  break;
				}
		     }
			
		     if(tot%11 == 0)
		      {
			    library.addBook(title,author,isbn,sign);
		        Added=true;
		      }
		     else 
			  Added=false;
		  }
	
}



	@Then("if the ISBN is valid the book will be added")
	public void if_the_isbn_is_valid_the_book_will_be_added() {
		if (Added==true)
		{	assertTrue(Added == true);
			System.out.println("-----------Book Added Sucsessfully-----------");
		}
		else{
			System.out.println("-----------Book can't be added because the ISBN is invalid----------- ");
		}
	}


//    @Then("the book will be added")
//    public void the_book_will_be_added() {
//    	if (Added==true)
//    	{	assertTrue(Added == true);
//    	  System.out.println("-----------Book Added Sucsessfully-----------");
//    	  }
//    }

    @Given("the administrator is not logged in")
    public void the_administrator_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Administrator is not logged in, can't add books");
    }


    @When("the user enter the {string} , the {string} and the {string} and Signature is {string} and he is not logged in")
    public void the_user_enter_the_the_and_the_and_signature_is_and_he_is_not_logged_in(String string, String string2, String string3, String string4) {
      
    }
    @Then("the book will not be added")
    public void the_book_will_not_be_added() {
  
			  assertTrue(Added == false);
			  System.out.println("-----------Book Can't be added-----------");
			 
    }


}
