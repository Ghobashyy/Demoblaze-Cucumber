package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LapTopPage {
    WebDriver driver;
    public LapTopPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By firstProduct = By.xpath("//a[contains(text(),'vaio i5')]");
    private By secondProduct = By.xpath("//a[contains(text(),'vaio i7')]");

    //Actions
    public FirstProductPage clickOnFirstProduct(){
        driver.findElement(firstProduct).click();
        return new FirstProductPage(driver);
    }
    public SecondProductPage clickOnSecondProduct(){
        driver.findElement(secondProduct).click();
        return new SecondProductPage(driver);
    }
}
