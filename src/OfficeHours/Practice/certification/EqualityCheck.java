package OfficeHours.Practice.certification;

public class EqualityCheck {
    public static void main(String[] args) {
        String x = new String("Hello World");
        String y = "Hello World";
        System.out.println(x == y); // false


        x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); // true
    }
}
