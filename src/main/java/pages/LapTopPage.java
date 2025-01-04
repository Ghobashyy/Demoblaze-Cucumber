package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LapTopPage {
    WebDriver driver;
    public LapTopPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By product1 = By.xpath("//a[contains(text(),'vaio i5')]");
    private By product2 = By.xpath("//a[contains(text(),'vaio i7')]");

    //Actions
    public Product1Page clickonproduct1(){
        driver.findElement(product1).click();
        return new Product1Page(driver);
    }
    public Product2Page clickonproduct2(){
        driver.findElement(product2).click();
        return new Product2Page(driver);
    }
}
