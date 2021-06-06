package OfficeHours.Practice_Replit.Loops;
import  java.util.Scanner;
public class ShoppingListLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        while (count<10){
            System.out.println("Enter item"  + count + " and its price:");

            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            System.out.println("Add one more item?");
            shoppingListReport += "Item" + count + ": " + item + " Price: " + price + ", ";
            count++;

            countinue = scan.next();

            if (countinue.equals("no"))
                break;
        }

        int z = shoppingListReport.length();
        System.out.println(shoppingListReport.substring(0, z - 2));
        System.out.println("Total price: " + totalPrice);


    }

}
