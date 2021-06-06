package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 30.0;
        boolean isPrimeMember = false;

        if (isPrimeMember) {
            System.out.println("eligible for free 2 day shipping");
        } else {
            if (itemPrice > 25) {
                System.out.println("Eligible for free shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is $10");
            }
        }
    }
}
