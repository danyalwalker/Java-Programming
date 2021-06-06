package OfficeHours.Practice_Replit;
import java.util.Scanner;
public class Burger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        double price;

        if (in.equals("burger") || in.equals("chicken")){
            price = 10.0;
            System.out.println(price);
        } else if ( in.equals("soda")){
            price = 2.0;
            System.out.println(price);
        } else if (in.equals("fries")){
            price = 3.5;
            System.out.println(price);
        }
    }
}
