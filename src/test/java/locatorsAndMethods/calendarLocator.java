package locatorsAndMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.baseUtil;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


/**
 * Created by andie on 29/05/2018.
 */
public class calendarLocator extends baseUtil{

    private baseUtil base;
    private WebDriverWait wait;


    public calendarLocator(baseUtil base) {
        this.base = base;
        PageFactory.initElements(base.driver, this);
        this.wait = new WebDriverWait(base.driver, 1000);

    }

    //Element Locations
    @FindBy(css = ".stay-dates-page .stay-dates-page__question")
    private WebElement calendarHearCopy;

    @FindBy(css = ".fixed-top>div>div>.mb-0")
    private WebElement hotelPropertyName;

    @FindBy(css = ".banner__hotel-country")
    private WebElement hotelCountry;

    @FindBy(css = ".stay-dates-page__dates>.dates-holder>.dates-holder__checkin>div>.dates-holder__dates-label")
    private WebElement checkInLabel;

    @FindBy(css = ".stay-dates-page__dates>.dates-holder>.dates-holder__checkout>div>.dates-holder__dates-label")
    private WebElement checkoutLabel;

    @FindBy(css = ".stay-dates-page__dates>div>div+div>.dates-holder__divider-label")
    private WebElement toLabel;

    @FindBy(css = ".stay-dates-page__btn-see-rooms")
    private WebElement seeRooms;

    //Element Methods
    public String getCalendarHeaderCopy(){
        return wait.until(visibilityOf(calendarHearCopy)).getText();
    }

    public String getHotelPropertyName(){
        return wait.until(visibilityOf(hotelPropertyName)).getText();
    }

    public String getHotelCountry(){
        return wait.until(visibilityOf(hotelCountry)).getText();
    }

    public String getCheckInLabel(){
        return wait.until(visibilityOf(checkInLabel)).getText();
    }

    public String getCheckoutLabel(){
        return wait.until(visibilityOf(checkoutLabel)).getText();
    }

    public String getToLabel(){
        return wait.until(visibilityOf(toLabel)).getText();
    }

    public WebElement getSeeRooms() {
        return wait.until(visibilityOf(seeRooms));
    }
}
