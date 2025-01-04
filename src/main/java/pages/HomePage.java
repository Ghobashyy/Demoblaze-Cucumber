package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //locators
    private By signup = By.id("signin2");
    private By login = By.id("login2");
    private By laptopscategories = By.xpath("//a[contains(text(),'Laptops')]");


    //actions
     public SignUpPage clickonsignup(){
        driver.findElement(signup).click();
        return new SignUpPage(driver);
    }
    public LogInPage clickonlogin(){
         driver.findElement(login).click();
         return new LogInPage(driver);
    }

    public LapTopPage clickonlaptops(){
         driver.findElement(laptopscategories).click();
         return new LapTopPage(driver);
    }
}
