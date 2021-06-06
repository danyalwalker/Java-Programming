package OfficeHours.Practice;
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in);
        System.out.println("How many people are living with in your apartment?");
        int roomMate = scan.nextInt();
        if (roomMate<2){
            System.out.println("Live with less than 2 people");
        } else if ( roomMate >= 3 && roomMate <= 6){
            System.out.println("Live with 3-6 people");
        } else if ( roomMate > 6){
            System.out.println("live with more than 6 people");
        }

        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("I live in " + city);
        Boolean downtown = true;
        System.out.println("Do you live in downtown? \n" + downtown);
        Boolean suburbs = true;
        if (downtown){
            System.out.println("Have you thought about moving to suburbs?");
        }
        if ( suburbs){
            System.out.println("Do it, it's great in suburbs.");
        } else {
            System.out.println("You should think about it");}


            System.out.println("What's you favorite animal?");
            String animal = scan.next();
            System.out.println("Wow! " + animal + " is a great animal!");
            System.out.println(" How many pets do you want?");
            int animals = scan.nextInt();
            System.out.println(" interesting do you want " + animals + " " + animal + "s?");





    }
}
