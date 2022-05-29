package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    By login = By.cssSelector("[href*='sign_in']");



    public WebElement getLogin() {
         return driver.findElement(login);

    }




















}
