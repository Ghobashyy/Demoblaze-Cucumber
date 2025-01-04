package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product2Page {
    WebDriver driver;
    public Product2Page(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By addproduct2 = By.xpath("//a[contains(text(),'Add to')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");

    //Actions
    public void addproduct2tocart(){
        driver.findElement(addproduct2).click();
    }
    public String getprodduct2alerttext(){
        String text = driver.switchTo().alert().getText();
        return text;
    }
    public void acceptproduct2alert(){
        driver.switchTo().alert().accept();
    }
    public void clickoncart2(){
        driver.findElement(cart).click();
    }
}
