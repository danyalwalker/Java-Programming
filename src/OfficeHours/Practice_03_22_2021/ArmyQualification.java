package OfficeHours.Practice_03_22_2021;
import java.util.Scanner;
public class ArmyQualification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your citizenship?");
        String citizenship = scan.nextLine();
        System.out.println("Are you resident?");
        boolean usResident = scan.nextBoolean();
        System.out.println("Do you have diploma?");
        boolean diploma = scan.nextBoolean();
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if (!citizenship.equals("USA") || !usResident) {
            System.out.println(" You must be a U.S. citizen or a resident");
        } else if (!(age >= 18 && age <= 35)) {
            System.out.println("Your age must be between 18 to 35 years old");
        } else if (!diploma) {
            System.out.println("You must have a high school diploma");
        } else if (((citizenship.equals("USA") && usResident)) && (age >= 18 && age <= 35) && diploma) {
            System.out.println("You are qualified for the US Army");
        }
    }
}