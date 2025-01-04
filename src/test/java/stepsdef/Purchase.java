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
    FirstProductPage firstProductPage;
    SecondProductPage secondProductPage;
    CartPage cartPage;
    PlaceOrderPage placeOrderPage;

    @When("user click on laptops categories")
    public void userClickOnLaptopsCategories() {
        homePage = new HomePage(driver);
        homePage.clickOnLaptops();
    }

    @When("user click on product1")
    public void userClickOnProduct1() throws InterruptedException {
        lapTopPage = new LapTopPage(driver);
        Thread.sleep(1000);
        lapTopPage.clickOnFirstProduct();
    }

    @When("user click on add product1 to cart")
    public void userClickAddProduct1ToCart() throws InterruptedException {
        firstProductPage = new FirstProductPage(driver);
        Thread.sleep(1000);
        firstProductPage.addFirstProductToCart();
    }

    @Then("Product1 added alert {string} should be displayed")
    public void product1AddedAlertShouldBeDisplayed(String message) throws InterruptedException {
        firstProductPage = new FirstProductPage(driver);
        Thread.sleep(1000);
        String actualResult = firstProductPage.getFirstProductAlertText();
        Assert.assertTrue(actualResult.contains(message));
    }

    @When("user accept product1 alert and goes to cart page")
    public void userAcceptProuct1AlertAndGoesToCartPage() throws InterruptedException {
        firstProductPage = new FirstProductPage(driver);
        Thread.sleep(1000);
        firstProductPage.acceptFirstProductAlert();
        Thread.sleep(1000);
        firstProductPage.clickOnCart();
    }

    @Then("product1 name {string} and price {string} should be displayed")
    public void product1nameandpriceshouldbedisplayed(String product1name , String product1price) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(2000);
        String actualResultname = cartPage.getFirstProductName();
        Assert.assertTrue(actualResultname.contains(product1name));
        String actualResultprice = cartPage.getFirstProductPrice();
        Assert.assertTrue(actualResultprice.contains(product1price));
    }

    @Then("user back to homepage")
    public void userBackToHomepage() {
        cartPage = new CartPage(driver);
        cartPage.clickOnHome();
    }

    @When("user click on product2")
    public void userClickOnProduct2() throws InterruptedException {
        lapTopPage = new LapTopPage(driver);
        Thread.sleep(1000);
        lapTopPage.clickOnSecondProduct();
    }

    @When("user click on add product2 to cart")
    public void userclickonaddproduct2tocart() throws InterruptedException {
        secondProductPage = new SecondProductPage(driver);
        Thread.sleep(1000);
        secondProductPage.addSecondProductToCart();
    }

    @Then("Second Product added alert {string} should be displayed")
    public void secondProductAddedAlertShouldBeDisplayed(String message2) throws InterruptedException {
        secondProductPage = new SecondProductPage(driver);
        Thread.sleep(1000);
        String actualResult = secondProductPage.getSecondProductAlertText();
        Assert.assertTrue(actualResult.contains(message2));
    }

    @When("user accept second product alert and goes to cart page")
    public void userAcceptSecondProductAlertAndGoesToCartPage() throws InterruptedException {
        secondProductPage = new SecondProductPage(driver);
        Thread.sleep(1000);
        secondProductPage.acceptSecondProductAlert();
        Thread.sleep(1000);
        secondProductPage.clickOnCartFromSecondProduct();
    }

    @Then("second product name {string} and price {string} should be displayed")
    public void secondProductNameAndPriceShouldBeDisplayed(String product2name , String product2price) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(2000);
        String actualResultName = cartPage.getSecondProductName();
        Assert.assertTrue(actualResultName.contains(product2name));
        String actualResultPrice = cartPage.getSecondProductPrice();
        Assert.assertTrue(actualResultPrice.contains(product2price));
    }

    @Then("total price should be {string}")
    public void verifyTotalPrice(String totalPrice) throws InterruptedException {
        cartPage = new CartPage(driver);
        Thread.sleep(1000);
        String actualResult = cartPage.getTotalPrice();
        Assert.assertTrue(actualResult.contains(totalPrice));
    }

    @When("click on place order")
    public void clickOnPlaceOrder() {
        cartPage = new CartPage(driver);
        cartPage.clickOnPlaceOrder();
    }

    @When("enter {string} {string} {string} {string} {string} {string}")
    public void enter(String name, String country, String city, String creditcard, String month, String year) throws InterruptedException {
        placeOrderPage = new PlaceOrderPage(driver);
        Thread.sleep(1000);
        placeOrderPage.enterName(name);
        placeOrderPage.enterCountry(country);
        placeOrderPage.enterCity(city);
        placeOrderPage.enterCreditCard(creditcard);
        placeOrderPage.enterMonth(month);
        placeOrderPage.enterYear(year);
    }

    @When("click on Purchase")
    public void clickOnPurchase() {
        placeOrderPage = new PlaceOrderPage(driver);
        placeOrderPage.clickOnPurchaseButton();
    }

    @Then("successful purchase message {string} should be displayed")
    public void verifySuccessfulPurchaseMessageShouldBeDisplayed(String successfulPurchase) throws InterruptedException {
        placeOrderPage = new PlaceOrderPage(driver);
        Thread.sleep(1000);
        String actualResult = placeOrderPage.successPurchase();
        Assert.assertTrue(actualResult.contains(successfulPurchase));
    }
}
