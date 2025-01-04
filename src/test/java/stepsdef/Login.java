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
        homePage.clickonlogin();
    }

    @When("user enter valid {string} and {string}")
    public void userEnterValidAnd(String username, String password) throws InterruptedException {
        logInPage = new LogInPage(driver);
        Thread.sleep(1000);
        logInPage.enterloginusername(username);
        logInPage.enterloginpassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        logInPage = new LogInPage(driver);
        logInPage.clickonloginbutton();
    }

    @Then("user should be back to homepage and welcome user's name {string} should be displayed")
    public void userShouldBeBackToHomepageAndWelcomeUserSNameTextShouldBeDisplayed(String message) throws InterruptedException {
        logInPage = new LogInPage(driver);
        Thread.sleep(3000);
        String actualResult = logInPage.getloginusertext();
        Assert.assertTrue(actualResult.contains(message));
    }

    @When("user enter invalid {string} and {string}")
    public void userEnterInvalidAnd(String username, String password) {
        logInPage = new LogInPage(driver);
        logInPage.enterloginusername(username);
        logInPage.enterloginpassword(password);
    }

    @When("click on login button")
    public void clickOnLoginButton() {
        logInPage = new LogInPage(driver);
        logInPage.clickonloginbutton();
    }

    @Then("Login alert {string} should be displayed")
    public void loginAlertShouldBeDisplayed(String message) throws InterruptedException {
        logInPage = new LogInPage(driver);
        Thread.sleep(1000);
        String acutalResult = logInPage.getloginalerttext();
        Assert.assertTrue(acutalResult.contains(message));
    }
}
