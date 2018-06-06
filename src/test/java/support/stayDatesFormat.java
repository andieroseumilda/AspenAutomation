package support;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class stayDatesFormat{

    private baseUtil base;
    private Calendar now;
    private int number_of_current_day = Calendar.DATE; // getting the date today (no. of day)
    private DateFormat date_format = new SimpleDateFormat("dd"); //only get the day
    private String get_arrival_date; // get the number of day


    public stayDatesFormat(baseUtil base) {
        this.base = base;
    }

    public String selectArrivalDate(){
        this.now = Calendar.getInstance(); // this is equal to 0
        now.add(number_of_current_day,0);  // now is 0, (no. of day today + 2) = this will be the value of "now"
        Date complete_date = now.getTime(); // get the value of now from above, then convert into Day, Date and timezone ex. Thu Jun 07 15:00:00 CST 2018
        get_arrival_date = date_format.format(complete_date); // only get the number of day example "06/05/2018 - MM/dd/YYYY" print dd
        return get_arrival_date.toString();
    }
}
