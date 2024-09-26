package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesForcesteps {

    WebDriver driver;

    @Given("user navigates to salesforce login page")
    public void salesForce(){
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/");

    }

    @When("user enter the username {string} and password {string}")
    public void UserNameAndPassword(String userName, String password) {
    }

    @And("user clicks the login button")
    public void userClicksTheLoginButton() {
    }


    @Then("user validates the navigation to the homepage")
    public void userValidatesTheNavigationToTheHomepage() {

    }


    @Then("user validate the error message")
    public void userValidatesTheErrorMessage() {
    }
}
