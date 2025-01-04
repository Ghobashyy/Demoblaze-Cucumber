package stepsdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void runBeforeAnyScenario(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoblaze.com/index.html");
    }
    @After
    public void runAfterAnyScenario(){
        driver.quit();
    }
    public static WebDriver getDriver (){
        return driver;
    }
}
