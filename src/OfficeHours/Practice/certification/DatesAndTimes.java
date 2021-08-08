package OfficeHours.Practice.certification;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatesAndTimes {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
//        public static LocalDate of(int year, int month, int dayOfMonth);
//        public static LocalDate of(int year, Month month, int dayOfMonth;)

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
//        public static LocalTime of(int hour, int minute)
//        public static LocalTime of(int hour, int minute, int second)
//        public static LocalTime of(int hour, int minute, int second, int nanos)


        /**
         * The date and time classes have private constructors to force you to use the static methods.
         * The date and time classes are immutable like String was.
         */
        //  LocalDate d = new LocalDate(); // DOES NOT COMPILE

        // LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException

        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusYears(5);
        System.out.println(date);


        date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime);
        dateTime = dateTime.minusSeconds(30);
        System.out.println("date and time: " + dateTime);

        dateTime = LocalDateTime.of(date2, time).minusDays(1).minusHours(10).minusSeconds(30); // chaining methods

        date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10); // it is ignored since it is not assigned to date, it's just an action. date is immutable
        System.out.println(date);

        date = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date.plusMinutes(1); // DOES NOT COMPILE since minutes is method of time

        Period annually = Period.ofYears(1); // every 1 year Period quarterly = Period.ofMonths(3); // every 3 months
        Period everyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndAWeek = Period.of(1, 0, 7);

        LocalDate upTo = LocalDate.of(2020, 1, 20);
        LocalDate end = LocalDate.of(2020, 4, 20);
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(everyThreeWeeks); // adds the period
        }

        Period wrong = Period.ofYears(1).ofWeeks(1); // compile error because because Period.ofxxx is a static method

        date = LocalDate.of(2020, Month.JANUARY, 20);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));

        date = LocalDate.of(2020, Month.JANUARY, 20);
        time = LocalTime.of(11, 12, 34);
        dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(date));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        f.format(dateTime);
        // f.format(date); throws exception
        f.format(time);
       // date = LocalDate.parse("01 02 2015", f);
        time = LocalTime.parse("11:22");
        System.out.println(date); // 2015-01-02
        System.out.println(time); // 11:22


    }
}
