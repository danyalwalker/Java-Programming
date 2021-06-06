package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class hourMinutesSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Seconds: ");

        int inputSeconds = scan.nextInt();

        int minutes = (inputSeconds / 60) % 60;

        int seconds = inputSeconds % 60;

        int hours = inputSeconds/60/60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

    }

}
