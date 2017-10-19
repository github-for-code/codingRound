//import com.sun.javafx.PlatformUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends ClearTripTest {

    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {

        driver.get("https://www.cleartrip.com/");
        waitFor(2000);

        page.yourTrips.click();
        waitFor(5000);

        page.signIn.click();
        driver.switchTo().frame(page.SignInModalStringId);
        page.signInButton.click();

        String errors1 = page.errors1.getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));

        driver.quit();
    }

}
