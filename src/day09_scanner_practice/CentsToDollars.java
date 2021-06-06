package day09_scanner_practice;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        System.out.println("cents = " + cents);
        int dollar = cents/100;
        System.out.println("dolar = " + dollar);
        int remain = cents % 100;
        System.out.println("remain = " + remain);
        // In 123 cents : 1 dollar 23 cents
        System.out.println("In " + cents + " cents: " + dollar + " dollar " + remain + " cents.");


    }
}
