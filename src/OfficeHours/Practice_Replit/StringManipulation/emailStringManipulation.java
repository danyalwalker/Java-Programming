package OfficeHours.Practice_Replit.StringManipulation;

import java.util.Scanner;

public class emailStringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")) {

            System.out.print(email.substring(email.indexOf("_") + 1, email.indexOf("@")));
            System.out.print("_");
            System.out.print(email.substring(0, email.indexOf("_")));
            System.out.println(email.substring(email.indexOf("@")));

        } else {
            System.out.println(email);
        }
    }
}
