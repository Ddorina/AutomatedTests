package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

    private WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        
    }
    
      //Locators

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]");

    //Actions
    public void enterUsername(String username) {
        //WebElement element = driver.findElement(usernameField);
       driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        //WebElement element = driver.findElement(passwordField);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        //WebElement element = driver.findElement(loginButton);
       driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        //WebElement element = driver.findElement(errorMessage);
        return driver.findElement(errorMessage).getText();
    }
}
