package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

public class GetQuantity {
    WebDriver driver = Hooks.getDriver();
    FirstProductPage firstProductPage;
    CartPage cartPage;


    @When("user accept first product alert")
    public void userAcceptFirstProductAlert() throws InterruptedException {
        firstProductPage = new FirstProductPage(driver);
        Thread.sleep(1000);
        firstProductPage.acceptFirstProductAlert();
    }

    @And("user click on add product1 again to cart")
    public void userClickOnAddProduct1AgainToCart() throws InterruptedException {
        firstProductPage = new FirstProductPage(driver);
        Thread.sleep(1000);
        firstProductPage.addFirstProductToCart();
    }

    @Then("Product quantity should be {int}")
    public void productQuantityShouldBe(int number) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(3000);
        int actualResult = cartPage.getQuantity();
        Assert.assertEquals(number,actualResult);
    }
}
