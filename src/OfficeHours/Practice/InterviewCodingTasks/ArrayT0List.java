package OfficeHours.Practice.InterviewCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayT0List {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names);
         list.set(0, "Sue");
         System.out.println(names[1]);

         byte x = 5;
         byte y = 10;
         double z = x + y;
        System.out.println(z);

        List <Integer> l1 = new ArrayList<Integer>();

    }
}
