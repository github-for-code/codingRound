import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotelBooking extends ClearTripTest {


    @Test
    public void shouldBeAbleToSearchForHotels() {

        driver.get("https://www.cleartrip.com/");
        page.hotelLink.click();

        page.setLocality("Indiranagar, Bangalore");
        page.checkInDate.click();
        waitFor(1000);
        page.checkOutDate.click();

        new Select (page.travellerSelection).selectByVisibleText("2 rooms, 4 adults");
        page.searchHotelsButton.click();
        Assert.assertTrue(isElementPresent(page.searchSummary));

        waitFor(4000);

        driver.quit();

    }

}
