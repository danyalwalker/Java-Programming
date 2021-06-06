package day18_conditions_practice_strings_intro;

import java.sql.SQLOutput;

public class FizzBuzz {
    public static void main(String[] args) {
        // FizzBuzz when divisible by 3 and 5
        // Fizz when divisible by 3
        // Buzz when divisible by 5
        int a = 16;
        if ( a % 3 == 0 && a % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (a % 3 == 0){
            System.out.println("Fizz");
        } else if (a % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println("It's neither Fizz, nor Buzz");
        }
    }
}
