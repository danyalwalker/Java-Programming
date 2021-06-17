package OfficeHours.practice_06_14_2021;

import java.util.Arrays;

/**
 * Create a class CandyFactory [ No inheritance with Candy classes ]
 *  *
 *  *     This class is to create objects of Candy, Take5, Twix and see how they are working
 */
public class CandyFactory {
    public static void main(String[] args) {
       Candy candy = new Candy("Harribo", 5, true);
        System.out.println(candy);

        Take5 barOne = new Take5(3, true);
        System.out.println(barOne);
        System.out.println(barOne.quantity);
        System.out.println(barOne.containsPeanut);
        barOne.setQuantity(5);
        System.out.println(barOne.quantity);
        System.out.println(barOne.brand);
        barOne.setBrand("Cool");
        System.out.println("barOne.brand = " + barOne.brand);


        Twix twix = new Twix(5,true);
        twix.setBrand("haribo");
        twix.setQuantity(12);
        System.out.println(twix);
        System.out.println("twix.getQuantity() = " + twix.getQuantity());


    }
}
