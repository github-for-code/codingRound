import com.sun.javafx.PlatformUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ClearTripTest {
    WebDriver driver = new ChromeDriver();
    ClearTripPage page;

    ClearTripTest() {
        setDriverPath();
        driver.manage().window().setSize(new Dimension(1200, 800));
        page = PageFactory.initElements(driver, ClearTripPage.class);
    }

    @Override
    protected void finalize() {
        driver.quit();
    }

    private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

    protected void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

//    protected boolean isElementPresent(By by) {
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }

    protected boolean isElementDisplayed(WebElement el) {
        try {
            return el.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected boolean isElementPresent(WebElement el) {
        try {
            el.isDisplayed();
            return true;    // If no error is thrown, element is present
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
