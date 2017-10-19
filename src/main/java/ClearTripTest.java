import com.sun.javafx.PlatformUtil;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ClearTripTest extends CommonGlobals {
    ClearTripPage page;

    ClearTripTest() {
        driver = new ChromeDriver();
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
}
