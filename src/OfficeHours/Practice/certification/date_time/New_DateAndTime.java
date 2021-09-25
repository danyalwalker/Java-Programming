package OfficeHours.Practice.certification.date_time;

import java.time.*;

public class New_DateAndTime {

    public static void main(String[] args) {
        LocalDate d = LocalDate .now();

        LocalDateTime dt = LocalDateTime. now();
        System.out.println(dt);

        LocalDate jan = LocalDate.of(2015, Month.JANUARY, 1);
        jan = jan.plusMonths(1);

        LocalDate feb = LocalDate.of(2015, 2, 1);
        feb = feb.plusDays(2);
        
        LocalDateTime dateTime = LocalDateTime.of(2021,8,29,6,15,30,200);
        dateTime = dateTime.minusNanos(200);
        System.out.println("dateTime = " + dateTime);
        dateTime = LocalDateTime.of(2021,8,29,6,15,30,200)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println("dateTime = " + dateTime);

        LocalTime time = LocalTime.of(6, 15);
        Period period = Period.ofMonths(1);
        System.out.println(time.plus(period));
    }

}
