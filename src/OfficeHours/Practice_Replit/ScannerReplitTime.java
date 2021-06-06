package OfficeHours.Practice_Replit;

import java.util.Scanner;

public class ScannerReplitTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What time is it?");
        int hour   = scan.nextInt();
        int minute = scan.nextInt();
        int second = scan.nextInt();
        String amOrPm = scan.next();

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);





    }
}
