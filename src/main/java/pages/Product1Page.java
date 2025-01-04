package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product1Page {
    WebDriver driver;
    public Product1Page(WebDriver driver) {
        this.driver = driver;
    }
    //Locators
    private By addproduct1 = By.xpath("//a[contains(text(),'Add to')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");

    //Actions
    public void addproduct1tocart(){
        driver.findElement(addproduct1).click();
    }
    public String getprodduct1alerttext(){
        String text = driver.switchTo().alert().getText();
        return text;
    }
    public void acceptproduct1alert(){
        driver.switchTo().alert().accept();
    }
    public void clickoncart(){
        driver.findElement(cart).click();
    }
}
