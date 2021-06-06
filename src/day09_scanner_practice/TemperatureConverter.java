package day09_scanner_practice;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);

        System.out.println("##### F TO C CONVERTER");
        System.out.println("Enter Fahrenheit: ");
        double fahrenheit = temperature.nextDouble();
        //(F-32) * (5/9)
        double celcius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "F in C:" + celcius);



    }
}
