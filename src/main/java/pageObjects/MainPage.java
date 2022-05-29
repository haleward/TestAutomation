package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    By homebutton = By.xpath("//a[text()='Home']");
    By popup = By.xpath("//button[text()='NO THANKS']");
    By login = By.xpath("(//div[@class='login-btn']/a)[2]");





    public WebElement getHome() {
       return driver.findElement(homebutton);

    }

    public int getPopUpSize(){
        return driver.findElements(popup).size();
    }

    public WebElement getPopUp(){
        return driver.findElement(popup);

    }









}
