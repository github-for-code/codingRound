import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SampleTest extends ClearTripTestBase {

    ClearTripPage page;

    @Test
    public void someTests() {
        page = PageFactory.initElements(driver, ClearTripPage.class);
        driver.get("http://cleartrip.com");
        page.setOrigin("Bangalore");

        driver.quit();
    }

}