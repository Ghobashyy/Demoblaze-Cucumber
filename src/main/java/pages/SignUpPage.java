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
    private By signupusername = By.id("sign-username");
    private By signuppassword = By.id("sign-password");
    private By signupbutton = By.xpath("//button[contains(text(),'Sign')]");


    //Actions
    public void entersignupusername(){
        String username = faker.name().username();
        driver.findElement(signupusername).sendKeys(username);
    }
    public void entersignuppassword(){
        String password = faker.name().name();
        driver.findElement(signuppassword).sendKeys(password);
    }
    public void enterinvalidsignupusername(String username){
        driver.findElement(signupusername).sendKeys(username);
    }
    public void enterinvalidsignuppassword(String password){
        driver.findElement(signuppassword).sendKeys(password);
    }
    public void clickonsignupbutton(){
        driver.findElement(signupbutton).click();
    }
    public String getsignupalerttext(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        String text = driver.switchTo().alert().getText();
        return text;
    }
}
