package OfficeHours.Practice.certification;

import java.util.ArrayList;
import java.util.List;

public class WrapperExamples {
    public static void main(String[] args) {
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

       // int bad1 = Integer.parseInt("a"); // throws NumberFormatException
       // Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

        List<Double> weights = new ArrayList<>();
        weights.add(50.5); //Autoboxing double
         weights.add(new Double(60));
         weights.remove(50.5); //Autoboxing it to remove()
         double first = weights.get(0); // unboxing

        List<Integer> heights = new ArrayList<>();
         heights.add(null);
         //int h = heights.get(0); // calling any method on null gives NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1); // index 1 is 2
        System.out.println(numbers);
        numbers.remove(new Integer(1));
        System.out.println(numbers);
    }
}
