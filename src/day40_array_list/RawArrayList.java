package day40_array_list;
import java.util.*;
/**
 * IQ
 * Difference between Array and ArryList?
 * Array is fixed size and ArrayList is resizable.
 * ArrayList can not store primitives. ArrayList stores Wrapper Class objects (integer, Double etc) instead.
 * Arrays can store primitives and objects.
 */
public class RawArrayList {
    public static void main(String[] args) {
        //Declare raw arraylist
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        // add values
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(2323);
        list1.add(false);
        list1.add(23.4);
        list1.add("Hello World");
        System.out.println(list1);
        System.out.println(list1.size());
        /**
         * Raw ArrayList is arraylist that can store objects of any type. it is not recommended to use like this, unless in some certain cases.
         * Instead we need to use Restricted Type that only allows certain type of data.
         * Ex: RESTRICTED: ArrayList<Integer> nums = new ArrayList<>()
         * RAW:  ArrayList nums = new ArrayList();
         */

    }
}
