package testpackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Logout;
import static org.junit.Assert.assertTrue;

public class LogoutSteps {
    Logout X = new Logout();
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.out.println("the user is logged in");
      //  throw new io.cucumber.java.PendingException();
    }

    @When("the user press logout")
    public void the_user_press_logout() {
        X.logoutt();
      //  throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        assertTrue(X.getLoggedout());
        X.setLoggedout(false);
       // throw new io.cucumber.java.PendingException();
    }

}