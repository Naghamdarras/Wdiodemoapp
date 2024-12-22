package pages;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class SwipePage {

    private final AndroidDriver driver;

    public SwipePage(AndroidDriver driver) {
        this.driver = driver;
    }

    @SuppressWarnings("deprecation")
	public void swipeToCard(String cardName) {
        boolean isCardVisible = false;
        int maxSwipes = 10;
        int swipeCount = 0;

        while (!isCardVisible && swipeCount < maxSwipes) {
            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.8);
            int endY = (int) (size.height * 0.2);

            // Perform swipe gesture
            new TouchAction<>(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();

            swipeCount++;

            // Check if the card is visible
            isCardVisible = driver.findElements(By.xpath("//android.widget.TextView[@text='" + cardName + "']")).size() > 0;
        }

        if (!isCardVisible) {
            throw new RuntimeException("Card with name '" + cardName + "' not found after " + maxSwipes + " swipes.");
        }
    }
}
