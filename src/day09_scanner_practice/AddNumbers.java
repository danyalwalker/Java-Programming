package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //ask question
        System.out.println("Enter 2 numbers.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 + num2);




    }
}
