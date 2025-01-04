package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstProductPage {
    WebDriver driver;
    public FirstProductPage(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By addFirstProduct = By.xpath("//a[contains(text(),'Add to')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");

    //Actions
    public void addFirstProductToCart(){
        driver.findElement(addFirstProduct).click();
    }
    public String getFirstProductAlertText(){
        String text = driver.switchTo().alert().getText();
        return text;
    }
    public void acceptFirstProductAlert(){
        driver.switchTo().alert().accept();
    }
    public void clickOnCart(){
        driver.findElement(cart).click();
    }
}
