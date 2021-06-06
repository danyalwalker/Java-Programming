package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculatorV3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How much is your salary?");
        int hourly = scan.nextInt();
        int weekly = 40 * hourly;
        int numWeeks = 52;
        int annual = weekly * numWeeks;
        String salary = ("My hourly rate is $" + hourly + ", so my annual salary is $" + annual + ".");

        System.out.println(salary);
    }
}
