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
    private By creditcard = By.id("card");
    private By month = By.id("month");
    private By year = By.id("year");
    private By purchasebutton = By.xpath("//button[contains(text(),'Purchase')]");
    private By purchasemessage = By.xpath("//h2[contains(text(),'Thank you')]");
    //Actions
    public void entername(String namee){
        driver.findElement(name).sendKeys(namee);
    }
    public void entercountry(String countryy){
        driver.findElement(country).sendKeys(countryy);
    }
    public void entercity(String cityy){
        driver.findElement(city).sendKeys(cityy);
    }
    public void entercreditcard(String credit){
        driver.findElement(creditcard).sendKeys(credit);
    }
    public void entermonth(String monthh){
        driver.findElement(month).sendKeys(monthh);
    }
    public void enteryear(String yeear){
        driver.findElement(year).sendKeys(yeear);
    }
    public void clickonpurchasebutton(){
        driver.findElement(purchasebutton).click();
    }
    public String successpurchase(){
       return driver.findElement(purchasemessage).getText();
    }
}
