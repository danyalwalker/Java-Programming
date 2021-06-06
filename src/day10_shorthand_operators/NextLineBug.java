package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine(); // bug fix known bug, work around
        String month = scan.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
        // Whenever you use nextLine after nextInt, nextDouble etc, use another empty NextLine before proceeding.

        
    }
}
