package support.locatorsAndMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.baseUtil;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


/**
 * Created by andie on 29/05/2018.
 */
public class calendarPageLocator extends baseUtil{

    private baseUtil base;
    private WebDriverWait wait;


    public calendarPageLocator(baseUtil base) {
        this.base = base;
        PageFactory.initElements(base.driver, this);
        this.wait = new WebDriverWait(base.driver, 1000);

    }

    //Element Locations
    @FindBy(css = ".stay-dates-page .stay-dates-page__question")
    private WebElement question_copy_for_stay_dates;

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

    //----------------stay dates section
    @FindBy(css = ".stay-dates-page__dates .dates-holder__checkin .dates-holder__day")
    private WebElement numberOfCheckin;

    @FindBy( css = ".stay-dates-page__dates .dates-holder__checkout .dates-holder__day")
    private WebElement numberOfCheckout;

    //stay dates button
    @FindBy(css = ".stay-dates-page__dates > [data-target=\"#calendarModal\"]")
    private WebElement stayDatesButton;

    //Calendar Modal
    @FindBy(css = ".modal-header .dates-holder__checkin>div>.dates-holder__dates-label")
    private WebElement checkinLabelModal;

    @FindBy(css = ".modal-header .dates-holder__divider-label")
    private WebElement toLabelModal;

    @FindBy(css = ".modal-header .dates-holder__checkout .dates-holder__dates-label")
    private WebElement checkoutLabelModal;

    @FindBy(css = ".modal-header [data-cy=\"check-in\"]")
    private WebElement checkinHeaderModal;

    @FindBy(css = ".modal-header [data-cy=\"check-out\"]")
    private WebElement checkoutHeaderModal;

    @FindBy(css = "#calendarModal .dates-holder__checkin  .dates-holder__month")
    private WebElement checkinMonthHeaderModal;

    @FindBy(css = "#calendarModal .dates-holder__checkout .dates-holder__month")
    private WebElement checkoutMonthHeaderModal;

    @FindBy(css = ".calendar__btn-rooms .calendar__btn-rooms-desc")
    private WebElement stayDatesOnSeeRoomsButton;

    @FindBy(css = "[data-cy=\"rate-filter\"]")
    private WebElement btnShowRates;

    //3 types of Show rates - Calendar Modal
    @FindBy(css = "[data-cy=\"rate-low\"]")
    private WebElement lowRatesLabel;

    @FindBy(css = "[data-cy=\"rate-mid\"]")
    private WebElement medianRatesLabel;

    @FindBy(css = "[data-cy=\"rate-high\"]")
    private WebElement highRatesLabel;

    @FindBy(css = "[data-cy=\"calendar-month\"]")
    private List<WebElement> noOfMonths;

    @FindBy(css = ".day--start-date")
    private WebElement startDateSelected;

    @FindBy(css = ".day--end-date")
    private WebElement endDateSelected;

    @FindBy(css = "[data-cy=\"holiday-filter\"]")
    private WebElement btnHoliday;

    @FindBy(css = ".day__label--is-holiday")
    private WebElement holiday;


    //Element Methods
    public String getCalendarHeaderCopy(){
        return wait.until(visibilityOf(question_copy_for_stay_dates)).getText();
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

    public String getNumberOfCheckinDay(){
        return wait.until(visibilityOf(numberOfCheckin)).getText();
    }

    public String getNumberofCheckoutDay(){
        return wait.until(visibilityOf(numberOfCheckout)).getText();
    }

    public void getStayDatesButton(){
        wait.until(visibilityOf(stayDatesButton)).click();
    }


    // Calendar Modal
    public String getCheckinLabelModal(){
        return wait.until((visibilityOf(checkinLabelModal))).getText();
    }

    public String getToLabelModal(){
        return wait.until(visibilityOf(toLabelModal)).getText();
    }

    public String getCheckoutLabelModal(){
        return wait.until(visibilityOf(checkoutLabelModal)).getText();
    }

    public String getHeaderCheckinModal(){
        return wait.until(visibilityOf(checkinHeaderModal)).getText();
    }

    public String getHeaderCheckoutModal(){
        return wait.until(visibilityOf(checkoutHeaderModal)).getText();
    }

    public void clickButtonShowRates(){
        wait.until(ExpectedConditions.elementToBeClickable((btnShowRates))).click();
    }

    public boolean getLowRates(){
        return wait.until((ExpectedConditions.visibilityOf(lowRatesLabel))).isDisplayed();
    }

    public boolean getMedianRates(){
        return wait.until(ExpectedConditions.visibilityOf(medianRatesLabel)).isDisplayed();
    }

    public boolean getHighRates(){
        return wait.until(ExpectedConditions.visibilityOf(highRatesLabel)).isDisplayed();
    }

    public List<WebElement> getNoOfMonth(){
        return noOfMonths;
    }

    public String getStartDateSelected(){
        return wait.until(ExpectedConditions.visibilityOf(startDateSelected)).getText();
    }

    public String getEndDateSelected(){
        return wait.until(ExpectedConditions.visibilityOf(endDateSelected)).getText();
    }

    public void clickButtonHoliday(){
        wait.until(ExpectedConditions.elementToBeClickable(btnHoliday)).click();
    }

    public boolean getHoliday(){
        return wait.until(ExpectedConditions.visibilityOf(holiday)).isEnabled();
    }

    public String getHeaderCheckinMonthName(){
        return wait.until(ExpectedConditions.visibilityOf(checkinMonthHeaderModal)).getText();
    }

    public String getHeaderCheckoutMonthName(){
        return wait.until(ExpectedConditions.visibilityOf(checkoutMonthHeaderModal)).getText();
    }

    public WebElement getStayDatesOnSeeRoomButton(){
        return wait.until(ExpectedConditions.visibilityOf(stayDatesOnSeeRoomsButton));
    }
}
