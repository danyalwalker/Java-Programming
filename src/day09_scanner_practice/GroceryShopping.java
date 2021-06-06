package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price for milk: ");
        double milk = scan.nextDouble();

        System.out.println("Enter price for bread:");
        double bread = scan.nextDouble();

        System.out.println("Enter price for cucumbers:");
        double cucumber = scan.nextDouble();

        System.out.println("Total price : " + ( milk + bread + cucumber));

        System.out.println("Enter item1 and it's price");
        double price1 = scan.nextDouble();
        System.out.println("shoes \n" + price1);
        System.out.println("Enter item2 and its price");
        double price2 = scan.nextDouble();
        System.out.println("shirt \n" + price2);
        System.out.println("Enter item3 and its price");
        double price3 = scan.nextDouble();
        System.out.println("scarf \n" + price3);
        System.out.println("Total price: " + (price1+price2+price3));








    }
}
