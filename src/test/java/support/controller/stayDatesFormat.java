package support.controller;

import support.baseUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class stayDatesFormat{

    private baseUtil base;
    private Calendar now;
    private int day_format = Calendar.DATE; // getting the date today (no. of day)
    private DateFormat date_pattern = new SimpleDateFormat("dd"); //only get the day
    private String get_stay_date; // get the number of day
    private String get_departure_date;

    public stayDatesFormat(baseUtil base) {
        this.base = base;
    }

    public String selectStayDate(int number_days_from_now){
        this.now = Calendar.getInstance(); // this is equal to 0
        now.add(day_format,number_days_from_now);  // now = (getting the date today format (no. of day) + 2)
        Date complete_date = now.getTime(); // get the value of now from above, then convert into Day, Date and timezone ex. Thu Jun 07 15:00:00 CST 2018
        get_stay_date = date_pattern.format(complete_date); // only get the number of day example "06/05/2018 - MM/dd/YYYY" print dd
        return get_stay_date.toString();
    }

}
