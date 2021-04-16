package Test_Package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mainpackage.Login;

import static org.junit.Assert.*;

public class LoginSteps {

    Login L = new Login();
    @Given("the username is {string} and the password is {string}")
    public void the_username_is_and_the_password_is(String user, String pass) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        L.setUsername(user); L.setPassword(pass);

    }

    @When("I fill in the username {string}")
    public void i_fill_in_the_username(String entered_user) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        L.setEnteredUsername(entered_user);

    }

    @When("I fill in the password {string}")
    public void i_fill_in_the_password(String entered_pass) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        L.setEnteredPasssword(entered_pass);

    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue((L.getEnteredUsername().equals(L.getUsername())) && (L.getEnteredPasssword().equals(L.getPassword())));


    }

    @Then("the user should not be logged in")
    public void the_user_should_not_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        assertTrue((L.getEnteredUsername().equals(L.getUsername())) && !(L.getEnteredPasssword().equals(L.getPassword())));

    }




}

