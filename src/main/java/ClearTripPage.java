import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ClearTripPage {

    // For Flight Booking
    @FindBy(id = "OneWay")
    public WebElement oneWay;

    @FindBy(id = "FromTag")
    public WebElement fromTag;

    @FindAll({@FindBy(id = "ui-id-1"),@FindBy(tagName = "li")})
    public List<WebElement> originOptions;

    @FindBy(id = "ToTag")
    public WebElement toTag;

    @FindAll({@FindBy(id = "ui-id-2"),@FindBy(tagName = "li")})
    public List<WebElement> destinationOptions;

    @FindBy(id = "searchBtn")
    public WebElement searchBtn;

    @FindBy(className = "searchSummary")
    public WebElement searchSummary;

    public void setOrigin(String origin) {
        fromTag.clear();
        fromTag.sendKeys(origin);
        waitFor(2000);

        originOptions.get(0).click();
    }

    public void setDestination(String destination) {
        toTag.clear();
        toTag.sendKeys(destination)
        waitFor(2000);

        destinationOptions.get(0).click();
    }
    // End Flight Booking


    @FindBy(linkText = "Hotels")
    public WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;


    /* We can a common waitFor across here & TestBase.. But at small scale, this is fine */
    protected void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
