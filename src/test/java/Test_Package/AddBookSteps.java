package Test_Package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Main_Package.Books_Library;
import static org.junit.Assert.assertTrue;

public class AddBookSteps {
    Books_Library BL = new Books_Library();
    @Given("the administrator is logged in")
    public void the_administrator_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(" the administrator is logged in ");
    }

    @When("the user enter the {string} , the {string} and the {string}")
    public void the_user_enter_the_the_and_the(String title, String author, String isbn) {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        BL.set_title(title); BL.set_author(author); BL.set_ISBN(isbn);
        Books_Library.Books.add(BL);
        Books_Library.added = true;
    }

    @Then("the book will be added")
    public void the_book_will_be_added() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        assertTrue(Books_Library.added == true);
        Books_Library.added = false;
//        for(int i = 0 ; i<Books_Library.Books.size() ; i++){
//            System.out.println(Books_Library.Books.get(i).author);
//        }
        //System.out.println(".....................................");
    }

    @Given("the administrator is not logged in")
    public void the_administrator_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println(" the administrator is not logged in ");
    }

    @When("the user enter the {string} , the {string} and the {string} and he is not logged in")
    public void the_user_enter_the_the_and_the_and_he_is_not_logged_in(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        BL.set_title(string); BL.set_author(string2); BL.set_ISBN(string3);
        Books_Library.Books.add(BL);
    }


    @Then("the book will not be added")
    public void the_book_will_not_be_added() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        assertTrue(Books_Library.added == false);
    }


}
