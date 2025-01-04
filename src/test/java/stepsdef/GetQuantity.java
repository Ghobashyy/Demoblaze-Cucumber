package stepsdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

public class GetQuantity {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    LapTopPage lapTopPage;
    Product1Page product1Page;
    Product2Page product2Page;
    CartPage cartPage;
    PlaceOrderPage placeOrderPage;

    @When("user accept product1 alert")
    public void useracceptproduct1alert() throws InterruptedException {
        product1Page = new Product1Page(driver);
        Thread.sleep(1000);
        product1Page.acceptproduct1alert();
    }

    @And("user click on add product1 again to cart")
    public void userClickOnAddProduct1AgainToCart() throws InterruptedException {
        product1Page = new Product1Page(driver);
        Thread.sleep(1000);
        product1Page.addproduct1tocart();
    }

    @Then("Product quantity should be {int}")
    public void productQuantityShouldBe(int number) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(3000);
        int actualResult = cartPage.getquantity();
        Assert.assertEquals(number,actualResult);
    }
}
