package OfficeHours.Practice.certification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {
    public static void main(String[] args) {
        //List to Array
        List<String> list = new ArrayList<>();
         list.add("hawk");
         list.add("robin");
         Object[] objectArray = list.toArray();
         System.out.println(objectArray.length); // 2
         String[] stringArray = list.toArray(new String[0]);
          System.out.println(stringArray.length); // 2


        //Array to List
         String[] array = { "hawk", "robin" }; // [hawk, robin]
         List<String> list2 = Arrays.asList(array); // returns fixed size
         System.out.println(list.size()); // 2
         list2.set(1, "test"); // [hawk, test]
         array[0] = "new"; // [new, test]
         for (String b : array) System.out.print(b + " "); // new test
         list2.remove(1); // throws UnsupportedOperation Exception
        /**
         * Line 21 converts the array to a List. Note that it isn’t the java.util.ArrayList we’ve grown used to.
         * It is a fixed-size, backed version of a List. Line 23 is okay because set() merely replaces an existing value.
         * It updates both array and list because they point to the same data store. Line 24 also changes both array and list.
         * Line 25 shows the array has changed to new test. Line 26 throws an exception because we are not allowed to change the size of the list.
         */

        List<String> list3 = Arrays.asList("one", "two"); // with varargs it is simple and easy
    }
}
