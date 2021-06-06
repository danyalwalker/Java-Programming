package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class TimeCOnversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        String first = s.substring(0,2);
        Integer i = Integer.parseInt(first);
        Integer pm = i + 12;
        String updated = Integer.toString(pm);

        if (s.contains("PM")){
            System.out.println(s.replace(s.substring(0,2),updated));
        }



    }
}
