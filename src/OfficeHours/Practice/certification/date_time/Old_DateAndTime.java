package OfficeHours.Practice.certification.date_time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;  // imports are from util package

public class Old_DateAndTime {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.AUGUST,29);
        Date Aug = c.getTime();

        Calendar g = new GregorianCalendar(2021, Calendar.AUGUST,29);
        Date August = g.getTime();

        Calendar d = Calendar.getInstance(); c.set(2015, 0, 1); // without the constant
        Date jan = c.getTime();
    }
}
