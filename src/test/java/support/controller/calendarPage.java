package support.controller;

import support.baseUtil;
import support.locatorsAndMethods.calendarPageLocator;

public class calendarPage extends baseUtil {

    private baseUtil base;
    private calendarPageLocator calendarLocator;

    public calendarPage(baseUtil base){
        this.base = base;
        calendarLocator = new calendarPageLocator(base);
    }

}
