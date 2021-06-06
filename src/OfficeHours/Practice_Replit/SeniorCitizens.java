package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class SeniorCitizens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizens = scan.nextInt();
        System.out.println("What is new citizen's age?");
        int citizenAge =scan.nextInt();
        if (citizenAge>=65){
            System.out.println ("Senior Citizen \nNew seniorCitizens count " + (seniorCitizens+1));
            System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
        } else if (citizenAge<65){
            System.out.println ("Non-Senior Citizen \nNew seniorCitizens count " + seniorCitizens);
            System.out.println("New nonSeniorCitizens count " + (nonSeniorCitizens+1));

        }
    }
}
