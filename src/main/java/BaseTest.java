


import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Utils.jsonreader;

import java.net.URL;
import java.util.Map;

public class BaseTest {
    protected static AndroidDriver driver;
    protected Map<String, Object> testData;

    //Define Capabilities to Run mobile
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "C:\\Users\\HP\\AndroidStudioProjects\\MyApplication/android.wdio.native.app.v1.0.8 (2).apk");
        caps.setCapability("automationName", "UiAutomator2");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        
        //Load test data
         testData = jsonreader.getData("src/resources/data.json");
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
