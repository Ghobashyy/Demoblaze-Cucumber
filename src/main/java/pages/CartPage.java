package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }
    //Locators
    private By homepage = By.xpath("//a[contains(text(),'Home')]");
    private By cart = By.xpath("//a[contains(text(),'Cart')]");
    private By prooductquantity = By.className("success");
    private By product1name = By.xpath("//td[contains(text(),'Sony vaio i5')]");
    private By product2name = By.xpath("//td[contains(text(),'Sony vaio i7')]");
    private By product1price = By.xpath("//td[contains(text(),'790')]");
    private By product2price = By.xpath("//td[contains(text(),'790')][1]");
    private By totalprice = By.id("totalp");
    private By placeorder = By.xpath("//button[contains(text(),'Place')]");
    //Actions
    public HomePage clickonhome(){
        driver.findElement(homepage).click();
        return new HomePage(driver);
    }
    public void clickoncart(){
        driver.findElement(cart).click();
    }
    public int getquantity(){
        int numberofelements =driver.findElements(prooductquantity).size();
        return numberofelements;
    }
    public String getproduct1name(){
       return driver.findElement(product1name).getText();
    }
    public String getproduct2name(){
        return driver.findElement(product2name).getText();
    }
    public String getproduct1price() {
        return driver.findElement(product1price).getText();
    }
    public String getproduct2price(){
        return driver.findElement(product2price).getText();
    }
    public String gettotalprice(){
       return driver.findElement(totalprice).getText();
    }
    public PlaceOrderPage clickonplaceorder(){
        driver.findElement(placeorder).click();
        return new PlaceOrderPage(driver);
    }
}
