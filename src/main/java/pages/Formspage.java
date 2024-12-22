package pages;


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Formspage {
    private AndroidDriver driver;

    public Formspage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void fillFormSection1() {
        // Locate and fill fields for Section 1
        By textField = By.id("com.wdiodemoapp:id/text-input");
        By switchField = By.id("com.wdiodemoapp:id/switch");

        // Fill text field
        String inputText = "Sample Text";
        driver.findElement(textField).sendKeys(inputText);

        // Toggle switch
        driver.findElement(switchField).click();

        // Assertions
        String enteredText = driver.findElement(textField).getText();
        Assert.assertEquals(enteredText, inputText, "Text input verification failed!");

        boolean isSwitchEnabled = driver.findElement(switchField).getAttribute("checked").equals("true");
        Assert.assertTrue(isSwitchEnabled, "Switch was not toggled successfully!");
    }

    public void fillFormSection2() {
        // Locate and fill fields for Section 2
        By dropdown = By.id("com.wdiodemoapp:id/dropdown");
        By dropdownOption = By.xpath("//android.widget.CheckedTextView[@text='Option 1']");

        // Select dropdown option
        driver.findElement(dropdown).click();
        driver.findElement(dropdownOption).click();

        // Assertions
        String selectedOption = driver.findElement(dropdown).getText();
        Assert.assertEquals(selectedOption, "Option 1", "Dropdown selection failed!");
    }

    public void fillFormSection3() {
        // Locate and interact with sliders for Section 3
        By slider = By.id("com.wdiodemoapp:id/slider");

        // Adjust slider value
   // sliderElement = driver.findElement(slider);
   //sliderElement.setValue("0.8"); // Set slider to 80%
  
       		

        // Assertions
     // String sliderValue = sliderElement.getAttribute("value");
      //Assert.assertEquals(sliderValue, "0.8", "Slider value verification failed!");
    }

    public void fillFormSection4() {
        // Locate and interact with buttons for Section 4
        By submitButton = By.id("com.wdiodemoapp:id/btn-submit");

        // Click submit button
        driver.findElement(submitButton).click();

        // Assertions
        By successMessage = By.id("com.wdiodemoapp:id/success-message");
        Assert.assertTrue(driver.findElement(successMessage).isDisplayed(), "Success message was not displayed!");
    }
}
