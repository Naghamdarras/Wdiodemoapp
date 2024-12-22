package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignupPage {
    private AndroidDriver driver;

    //Locator for find elements 
    private final By usernameField = By.id("com.wdiodemoapp:id/input-email");
    private final By passwordField = By.id("com.wdiodemoapp:id/input-password");
    private final By confirmpasswordField = By.id("com.wdiodemoapp:id/input-confirmpassword");
    private final By signupButton = By.id("com.wdiodemoapp:id/btn-login");

    public SignupPage(AndroidDriver driver) {
        this.driver = driver;
    }

   // Method to perform signup action
    public void signup(String username, String password, String confirmpassword) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmpasswordField).sendKeys(confirmpassword); // Use confirmpasswordField
        driver.findElement(signupButton).click(); //  to  CLICK ON signupButton
    }

   // Method to check if signup was successful
    public boolean isSignupSuccessful() {
        try {
            return driver.findElement(By.id("successmessage")).isDisplayed();
        } catch (Exception e) {
            return false; // Handle the case where the success message is not found
        }
    }
}
