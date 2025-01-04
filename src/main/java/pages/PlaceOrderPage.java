package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage {
    WebDriver driver;
    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By name = By.id("name");
    private By country = By.id("country");
    private By city = By.id("city");
    private By creditCard = By.id("card");
    private By month = By.id("month");
    private By year = By.id("year");
    private By purchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
    private By purchaseMessage = By.xpath("//h2[contains(text(),'Thank you')]");
    //Actions
    public void enterName(String namee){
        driver.findElement(name).sendKeys(namee);
    }
    public void enterCountry(String countryy){
        driver.findElement(country).sendKeys(countryy);
    }
    public void enterCity(String cityy){
        driver.findElement(city).sendKeys(cityy);
    }
    public void enterCreditCard(String credit){
        driver.findElement(creditCard).sendKeys(credit);
    }
    public void enterMonth(String monthh){
        driver.findElement(month).sendKeys(monthh);
    }
    public void enterYear(String yeear){
        driver.findElement(year).sendKeys(yeear);
    }
    public void clickOnPurchaseButton(){
        driver.findElement(purchaseButton).click();
    }
    public String successPurchase(){
       return driver.findElement(purchaseMessage).getText();
    }
}
