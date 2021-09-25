package OfficeHours.Practice.certification.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
         System.out.println(shortDateTime.format(date)); // 1/20/20
       // System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
       // System.out.println(time.format(shortDateTime)); // UnsupportedTemporalTypeException

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f));
        DateTimeFormatter a = DateTimeFormatter.ofPattern("MM dd, yy, hh:mm");
        System.out.println(dateTime.format(a));
       // System.out.println(f.format(date)); // UnsupportedTemporalTypeException
       // System.out.println("date.format(a) = " + date.format(a));  same with the line above, just switched placed


        DateTimeFormatter ref = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        LocalDate dateTime1 = LocalDate.parse("January 12, 1979",ref);
        System.out.println("dateTime1 = " + dateTime1);
    }
}
