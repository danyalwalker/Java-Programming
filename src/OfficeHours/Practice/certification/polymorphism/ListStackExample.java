package OfficeHours.Practice.certification.polymorphism;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ListStackExample {
    public static void main(String [] args){
        List<Integer>myList = (List)new Stack<>(); //downcasting, do not have to explicity do it
        myList.addAll(Arrays.asList(1,2,3,4,5));
        ((Stack)myList).pop();

        // the list object has only access to list methods, so can not apply put method
        //in order to apply pop method I can explicitly downcast
        //  ((Stack)list).

        myList.forEach(number -> {
            if (((Stack<Integer>) myList).peek() < 3) {
                System.out.println("something");
            }
        });
    }


}
