package support.controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.baseUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class stayDatesFormat{

    private baseUtil base;
    private Calendar now;
    private int day_format = Calendar.DATE; // getting the date today (no. of day)
    private DateFormat day_pattern = new SimpleDateFormat("dd"); //only get the day
    private DateFormat month_pattern = new SimpleDateFormat("MM");
    private DateFormat year_pattern= new SimpleDateFormat("YYYY");
    private String get_stay_date; // get the number of day
    private WebDriverWait wait;

    public stayDatesFormat(baseUtil base) {

        this.base = base;
        this.wait = new WebDriverWait(base.driver, 3000);
    }

    public String dayFormat(int number_days_from_now){
        this.now = Calendar.getInstance(); // this is equal to 0
        now.add(day_format,number_days_from_now);  // now = (getting the date today format (no. of day) + 2)
        // <now.getTime> get the value of now from above, then convert into Day, Date and timezone ex. Thu Jun 07 15:00:00 CST 2018
        get_stay_date = day_pattern.format(now.getTime()); // only get the number of day example "06/05/2018 - MM/dd/YYYY" print dd
        return get_stay_date.toString();

    }

    public String dateFormat(int number_days_from_now){
        this.now = Calendar.getInstance(); // this is equal to 0
        now.add(day_format,number_days_from_now);  // now = (getting the date today format (no. of day) + 2)
        Date complete_date = now.getTime(); // get the value of now from above, then convert into Day, Date and timezone ex. Thu Jun 07 15:00:00 CST 2018
       // only get the number of day example "06/05/2018 - MM/dd/YYYY" print dd
        return year_pattern.format(complete_date)+month_pattern.format(complete_date)+day_pattern.format(complete_date);
    }
    public void selectStayDates(int number_days_from_now) {
        String getCheckDay = dateFormat(number_days_from_now);
        WebElement checkDay = base.driver.findElement(By.cssSelector("[data-cy=\""+getCheckDay+"\"]"));
        wait.until(ExpectedConditions.visibilityOf(checkDay));
        checkDay.click();
    }


}
