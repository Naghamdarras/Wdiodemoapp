package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    private AndroidDriver driver;

    //Locator for find elements 
    private final By usernameField = By.id("com.wdiodemoapp:id/input-email"); //Find user name field 
    private final By passwordField = By.id("com.wdiodemoapp:id/input-password");//Find password field 
    private final By loginButton = By.id("com.wdiodemoapp:id/btn-login");//Find login button 

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    // Method to perform signup action
    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username); //insert dynamic user name 
        driver.findElement(passwordField).sendKeys(password);//insert dynamic password 
        driver.findElement(loginButton).click();
    }

 // Method to check if login was successful
    public boolean isLoginSuccessful() {
        return driver.findElement(By.id("success-message-id")).isDisplayed();
    }
}
