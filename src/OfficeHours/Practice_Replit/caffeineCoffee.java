package OfficeHours.Practice_Replit;
import java.util.Scanner;

public class caffeineCoffee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter number of milligrams in drink:");
        int drink = scan.nextInt();
        int overdose = 10000;
        int numberOfDrinks = overdose / drink;

        System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose.");

    }






}
