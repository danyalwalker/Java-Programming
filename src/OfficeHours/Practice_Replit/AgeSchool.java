package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class AgeSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();

        if ( age < 2 ){
            System.out.println("ineligible");
        } else if (3<=age && age <= 5){
            System.out.println("early childhood");
        } else if (6<=age && age <= 7){
            System.out.println("young reader");
        } else if (8<=age && age <= 10){
            System.out.println("elementary");
        } else if (11<=age && age <= 12){
            System.out.println("middle");
        } else if (14<=age && age <= 16){
            System.out.println("high school");
        } else if (17<=age && age <= 18){
            System.out.println("scholar");
        } else if (age>18){
            System.out.println("ineligible");
        } else if (age==13){
            System.out.println("impossible");
        } else if (age==2){
            System.out.println("toddler");
        }
    }
}
