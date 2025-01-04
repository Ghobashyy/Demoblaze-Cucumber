package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInPage {
    WebDriver driver;
    WebDriverWait wait;
    public LogInPage(WebDriver driver){
        this.driver=driver;
    }
    //Locators
    private By loginusername = By.id("loginusername");
    private By loginpassword = By.id("loginpassword");
    private By loginbutton = By.xpath("//button[contains(text(),'Log')]");

    private By loginusertext = By.cssSelector("a[id='nameofuser']");

    //Actions
    public void enterloginusername(String username){
        driver.findElement(loginusername).sendKeys(username);
    }
    public void enterloginpassword(String password){
        driver.findElement(loginpassword).sendKeys(password);
    }
    public void clickonloginbutton(){
        driver.findElement(loginbutton).click();
    }
    public String getloginusertext(){
        String text = driver.findElement(loginusertext).getText();
        return text;
    }
    public String getloginalerttext(){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        return text;
    }
}
