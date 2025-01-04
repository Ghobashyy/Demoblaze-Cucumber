package stepsdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.*;

public class Purchase {
    WebDriver driver = Hooks.getDriver();
    HomePage homePage;
    LapTopPage lapTopPage;
    Product1Page product1Page;
    Product2Page product2Page;
    CartPage cartPage;
    PlaceOrderPage placeOrderPage;

    @When("user click on laptops categories")
    public void userClickOnLaptopsCategories() {
        homePage = new HomePage(driver);
        homePage.clickonlaptops();
    }

    @When("user click on product1")
    public void userClickOnProduct1() throws InterruptedException {
        lapTopPage = new LapTopPage(driver);
        Thread.sleep(1000);
        lapTopPage.clickonproduct1();
    }

    @When("user click on add product1 to cart")
    public void userClickAddProduct1ToCart() throws InterruptedException {
        product1Page = new Product1Page(driver);
        Thread.sleep(1000);
        product1Page.addproduct1tocart();
    }

    @Then("Product1 added alert {string} should be displayed")
    public void product1AddedAlertShouldBeDisplayed(String message) throws InterruptedException {
        product1Page = new Product1Page(driver);
        Thread.sleep(1000);
        String actualResult = product1Page.getprodduct1alerttext();
        Assert.assertTrue(actualResult.contains(message));
    }

    @When("user accept product1 alert and goes to cart page")
    public void userAcceptProuct1AlertAndGoesToCartPage() throws InterruptedException {
        product1Page = new Product1Page(driver);
        Thread.sleep(1000);
        product1Page.acceptproduct1alert();
        Thread.sleep(1000);
        product1Page.clickoncart();
    }

    @Then("product1 name {string} and price {string} should be displayed")
    public void product1nameandpriceshouldbedisplayed(String product1name , String product1price) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(2000);
        String actualResultname = cartPage.getproduct1name();
        Assert.assertTrue(actualResultname.contains(product1name));
        String actualResultprice = cartPage.getproduct1price();
        Assert.assertTrue(actualResultprice.contains(product1price));
    }

    @Then("user back to homepage")
    public void userBackToHomepage() {
        cartPage = new CartPage(driver);
        cartPage.clickonhome();
    }

    @When("user click on product2")
    public void userClickOnProduct2() throws InterruptedException {
        lapTopPage = new LapTopPage(driver);
        Thread.sleep(1000);
        lapTopPage.clickonproduct2();
    }

    @When("user click on add product2 to cart")
    public void userclickonaddproduct2tocart() throws InterruptedException {
        product2Page = new Product2Page(driver);
        Thread.sleep(1000);
        product2Page.addproduct2tocart();
    }

    @Then("Product2 added alert {string} should be displayed")
    public void Product2addedalertshouldbedisplayed(String message2) throws InterruptedException {
        product2Page = new Product2Page(driver);
        Thread.sleep(1000);
        String actualResult = product2Page.getprodduct2alerttext();
        Assert.assertTrue(actualResult.contains(message2));
    }

    @When("user accept product2 alert and goes to cart page")
    public void useracceptproduct2alertandgoestocartpage() throws InterruptedException {
        product2Page = new Product2Page(driver);
        Thread.sleep(1000);
        product2Page.acceptproduct2alert();
        Thread.sleep(1000);
        product2Page.clickoncart2();
    }

    @Then("product2 name {string} and price {string} should be displayed")
    public void product2nameandpriceshouldbedisplayed(String product2name , String product2price) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(2000);
        String actualResultname = cartPage.getproduct2name();
        Assert.assertTrue(actualResultname.contains(product2name));
        String actualResultprice = cartPage.getproduct2price();
        Assert.assertTrue(actualResultprice.contains(product2price));
    }

    @Then("total price should be {string}")
    public void verifyTotalPrice(String totalprice) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(1000);
        String actualResult = cartPage.gettotalprice();
        Assert.assertTrue(actualResult.contains(totalprice));
    }

    @When("click on place order")
    public void clickOnPlaceOrder() {
        cartPage = new CartPage(driver);
        cartPage.clickonplaceorder();
    }

    @When("enter {string} {string} {string} {string} {string} {string}")
    public void enter(String name, String country, String city, String creditcard, String month, String year) throws InterruptedException {
        placeOrderPage = new PlaceOrderPage(driver);
        Thread.sleep(1000);
        placeOrderPage.entername(name);
        placeOrderPage.entercountry(country);
        placeOrderPage.entercity(city);
        placeOrderPage.entercreditcard(creditcard);
        placeOrderPage.entermonth(month);
        placeOrderPage.enteryear(year);
    }

    @When("click on Purchase")
    public void clickOnPurchase() {
        placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.clickonpurchasebutton();
    }

    @Then("successful purchase message {string} should be displayed")
    public void verifySuccessfulPurchaseMessageShouldBeDisplayed(String successfulpurchase) throws InterruptedException {
        placeOrderPage = new PlaceOrderPage(driver);
        Thread.sleep(1000);
        String actualresult = placeOrderPage.successpurchase();
        Assert.assertTrue(actualresult.contains(successfulpurchase));
    }
}
