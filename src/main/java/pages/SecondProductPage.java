package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondProductPage {
    WebDriver driver;
    public SecondProductPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By addSecondProduct = By.xpath("//a[contains(text(),'Add to')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");

    //Actions
    public void addSecondProductToCart(){
        driver.findElement(addSecondProduct).click();
    }
    public String getSecondProductAlertText(){
        String text = driver.switchTo().alert().getText();
        return text;
    }
    public void acceptSecondProductAlert(){
        driver.switchTo().alert().accept();
    }
    public void clickOnCartFromSecondProduct(){
        driver.findElement(cart).click();
    }
}
