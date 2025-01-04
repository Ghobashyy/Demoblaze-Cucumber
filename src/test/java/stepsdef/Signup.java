package stepsdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

public class Signup {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    SignUpPage signUpPage;

    @Given("Homepage should be opened")
    public void HomePageShouldBeOpend() {
        homePage = new HomePage(driver);
    }

    @When("user click on signup")
    public void userClickOnSignup() {
        homePage = new HomePage(driver);
        homePage.clickOnSignup();
    }

    @When("User enter valid username and password")
    public void userEnterValidUsernameAndPassword() {
        signUpPage = new SignUpPage(driver);
        signUpPage.enterSignupUsername();
        signUpPage.enterSignupPassword();
    }

    @When("user click on signup button")
    public void userClickOnSignupButton() {
        signUpPage = new SignUpPage(driver);
        signUpPage.clickOnSignupButton();
    }

    @Then("Successful alert {string} should be displayed")
    public void successfulAlertShouldBeDisplayed(String message) {
        signUpPage = new SignUpPage(driver);
        String actualResult = signUpPage.getSignupAlertText();
        Assert.assertTrue(actualResult.contains(message));
    }

    @When("User enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        signUpPage = new SignUpPage(driver);
        signUpPage.enterInvalidSignupUsername(username);
        signUpPage.enterInvalidSignupPassword(password);
    }

    @Then("Error Signup alert {string} should be displayed")
    public void errorSignupAlertShouldBeDisplayed(String message2) {
        signUpPage = new SignUpPage(driver);
        String actualResult = signUpPage.getSignupAlertText();
        Assert.assertTrue(actualResult.contains(message2));
    }
}