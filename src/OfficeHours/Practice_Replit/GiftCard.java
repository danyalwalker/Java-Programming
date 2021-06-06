package OfficeHours.Practice_Replit;
import java.util.Scanner;
public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String item = scan.next();
        int blanket = 60;
        int charger = 25;
        int hat = 25;
        int headphones = 30;
        int laptop = 200;
        int pants = 50;
        int pillow = 40;
        int smartphone = 1000;
        int socks = 5;
        int usbCable = 10;

        if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - blanket) + "$");
        } else if
        (item.equals("Charger")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - charger) + "$");
        } else if
        (item.equals("Hat")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - hat) + "$");
        } else if
        (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - headphones) + "$");
        } else if
        (item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if
        (item.equals("Pants")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - pants) + "$");
        } else if
        (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - pillow) + "$");
        } else if
        (item.equals("Smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if
        (item.equals("Socks")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - socks) + "$");
        } else if
        (item.equals("USB cable")) {
            System.out.println("Thank you for your purchase! \nYour current balance is: " + (100 - usbCable) + "$");
        } else {
            System.out.println("Invalid item!"); }





    }
}
