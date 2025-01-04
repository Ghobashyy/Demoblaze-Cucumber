package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;
    WebDriverWait wait;
    Faker faker = new Faker();
    public SignUpPage(WebDriver driver){
        this.driver=driver;
    }
    //Locators
    private By signupUsername = By.id("sign-username");
    private By signupPassword = By.id("sign-password");
    private By signupButton = By.xpath("//button[contains(text(),'Sign')]");


    //Actions
    public void enterSignupUsername(){
        String username = faker.name().username();
        driver.findElement(signupUsername).sendKeys(username);
    }
    public void enterSignupPassword(){
        String password = faker.name().name();
        driver.findElement(signupPassword).sendKeys(password);
    }
    public void enterInvalidSignupUsername(String username){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signupUsername)));
        driver.findElement(signupUsername).sendKeys(username);
    }
    public void enterInvalidSignupPassword(String password){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signupPassword)));
        driver.findElement(signupPassword).sendKeys(password);
    }
    public void clickOnSignupButton(){
        driver.findElement(signupButton).click();
    }
    public String getSignupAlertText(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        return text;
    }
}
