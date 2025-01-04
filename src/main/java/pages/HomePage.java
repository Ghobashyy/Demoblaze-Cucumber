package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //locators
    private By signUp = By.id("signin2");
    private By logIn = By.id("login2");
    private By laptopsCategories = By.xpath("//a[contains(text(),'Laptops')]");


    //actions
     public SignUpPage clickOnSignup(){
        driver.findElement(signUp).click();
        return new SignUpPage(driver);
    }
    public LogInPage clickOnLogin(){
         driver.findElement(logIn).click();
         return new LogInPage(driver);
    }

    public LapTopPage clickOnLaptops(){
         driver.findElement(laptopsCategories).click();
         return new LapTopPage(driver);
    }
}
