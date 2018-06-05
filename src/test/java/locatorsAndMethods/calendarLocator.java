package locatorsAndMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


/**
 * Created by andie on 29/05/2018.
 */
public class calendarLocator{

    private WebDriverWait wait;

    public calendarLocator() {

    }

    //Element Locations
    @FindBy(css = ".stay-dates-page .stay-dates-page__question")
    private WebElement calendarHearCopy;



    //Element Methods
    public WebElement getCalendarHeaderCopy(){
        return wait.until(visibilityOf(calendarHearCopy));
    }


}
