package stepsdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LogInPage;

public class Login {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    LogInPage logInPage;

    @When("user click on login")
    public void userClickOnLogin() {
        homePage = new HomePage(driver);
        homePage.clickOnLogin();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String username, String password) {
        logInPage = new LogInPage(driver);
        logInPage.enterLoginUsername(username);
        logInPage.enterLoginPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        logInPage = new LogInPage(driver);
        logInPage.clickOnLoginButton();
    }

    @Then("user should be back to homepage and welcome user's name {string} should be displayed")
    public void userShouldBeBackToHomepageAndWelcomeUserSNameTextShouldBeDisplayed(String message) {
        logInPage = new LogInPage(driver);
        String actualResult = logInPage.getLoginUserText();
        Assert.assertTrue(actualResult.contains(message));
    }

    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        logInPage = new LogInPage(driver);
        logInPage.enterLoginUsername(username);
        logInPage.enterLoginPassword(password);
    }

    @When("click on login button")
    public void clickOnLoginButton() {
        logInPage = new LogInPage(driver);
        logInPage.clickOnLoginButton();
    }

    @Then("Login alert {string} should be displayed")
    public void loginAlertShouldBeDisplayed(String message) {
        logInPage = new LogInPage(driver);
        String actualResult = logInPage.getLoginAlertText();
        Assert.assertTrue(actualResult.contains(message));
    }
}
