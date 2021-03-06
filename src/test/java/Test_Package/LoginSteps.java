package Test_Package;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Main_Package.login;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginSteps {

    login L = new  login();
    @Given("the username is {string} and the password is {string}")
    public void the_username_is_and_the_password_is(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        L.set_username(user); L.set_password(pass);

    }

    @When("I fill in the username {string}")
    public void i_fill_in_the_username(String entered_user) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        L.entered_username = entered_user;

    }

    @When("I fill in the password {string}")
    public void i_fill_in_the_password(String entered_pass) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        L.entered_passsword = entered_pass;

    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue((L.entered_username.equals(L.username)) && (L.entered_passsword.equals(L.password)));


    }

    @Then("the user should not be logged in")
    public void the_user_should_not_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue((L.entered_username.equals(L.username)) && !(L.entered_passsword.equals(L.password)));

    }




}

