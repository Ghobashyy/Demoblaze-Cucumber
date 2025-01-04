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
    private By loginUsername = By.id("loginusername");
    private By loginPassword = By.id("loginpassword");
    private By loginButton = By.xpath("//button[contains(text(),'Log')]");
    private By loginUserText = By.cssSelector("a[id='nameofuser']");

    //Actions
    public void enterLoginUsername(String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginUsername)));
        driver.findElement(loginUsername).sendKeys(username);
    }
    public void enterLoginPassword(String password){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loginPassword)));
        driver.findElement(loginPassword).sendKeys(password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public String getLoginUserText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("a[id='nameofuser']"),"Welcome MostafaGhobashy"));
        String text = driver.findElement(loginUserText).getText();
        return text;
    }
    public String getLoginAlertText(){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        return text;
    }
}
