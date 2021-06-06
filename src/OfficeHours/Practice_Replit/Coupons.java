package OfficeHours.Practice_Replit;
import java.util.Scanner;
public class Coupons {
    public static void main(String[] args) {
        System.out.println("Enter number of coupons:");
        Scanner input = new Scanner(System.in);
        int coupons = input.nextInt();

        int candyBars = coupons/10;
        int gumballs = (coupons % 10)/3;
        if(coupons>=3) {
            System.out.println("Number of Candies: " + candyBars);
            System.out.println("Number of Gumballs: " + gumballs);
        } else {
            System.out.println("Not enough coupons");}
    }
}
