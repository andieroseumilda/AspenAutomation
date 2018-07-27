package support.locatorsAndMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import support.baseUtil;

public class roomAndRatesLocator {

    private baseUtil base;

    public roomAndRatesLocator(baseUtil base) {
        this.base = base;
    }

    //Elements
    @FindBy(css="")
    private WebElement roomName;


    //Methods

}
