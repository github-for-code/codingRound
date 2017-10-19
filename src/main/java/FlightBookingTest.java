import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends ClearTripTest {

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        driver.get("https://www.cleartrip.com/");
        waitFor(2000);

        page.setOrigin("Bangalore");
        page.setDestination("Delhi");

        page.travelDate.click();

        //all fields filled in. Now click on search
        page.searchBtn.click();

        waitFor(5000);
        //verify that result appears for the provided journey search
        Assert.assertTrue(isElementPresent(page.searchSummary));

        //close the browser
        driver.quit();

    }

}
