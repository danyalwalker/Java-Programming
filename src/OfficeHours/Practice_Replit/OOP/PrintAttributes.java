package OfficeHours.Practice_Replit.OOP;
import java.util.*;
public class PrintAttributes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atts a = new Atts();
        a.name = in.next();
        a.color = in.next();
        a.amount = in.nextInt();

        System.out.println(a.asString());
    }

    public static class Atts{
        String name, color;
        int amount;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public  String asString( ) {
        String a = "name: " + name + " color: " + color + " amount " + amount;
        return a;
    }
    }
}
