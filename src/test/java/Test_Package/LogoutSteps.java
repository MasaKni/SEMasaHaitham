package Test_Package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Logout;
import static org.junit.Assert.assertTrue;

public class LogoutSteps {
    Logout X = new Logout();
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("the user is logged in");
    }

    @When("the user press logout")
    public void the_user_press_logout() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        X.logoutt();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue(X.getLoggedout());
        X.setLoggedout(false);
    }

}

