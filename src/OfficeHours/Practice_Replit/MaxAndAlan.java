package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class MaxAndAlan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");

        String name = scan.nextLine();
        name = name.toLowerCase();

        if ( name.equals("Max Payne".toLowerCase()) || name.equals("Alan Wake".toLowerCase())){
            System.out.println("User found!");
        } else {
            System.out.println("User not found!");
        }





    }
}
