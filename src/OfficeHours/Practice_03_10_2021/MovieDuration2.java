package OfficeHours.Practice_03_10_2021;

import java.util.Scanner;

public class MovieDuration2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the length of the movie: ");
        double movieLength = input.nextDouble();
        double price;

        if (movieLength == 1) {             // = is for assignment where as == is for comparison
            System.out.println("price = " + 8.99);

        }
        if (movieLength == 1.5) {
            System.out.println("price = " + 10.50);
        }

        if (movieLength == 2.0) {
            System.out.println("price = " + 12.99);
        }

        if (movieLength == 2.5) {
            System.out.println("price = " + 14.50);
        }

        if (movieLength >= 3.0) {
            System.out.println("price = " + 15.99);
        }


    }
}
