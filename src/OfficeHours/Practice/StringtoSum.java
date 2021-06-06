package OfficeHours.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringtoSum {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "23", "54"));
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size() ; i++) {
            int totalSum = 0;
           for(String digit:list.get(i).split("")){
               totalSum+= Integer.parseInt(digit);
           }
            newList.set(i, totalSum);
        }

        System.out.println(newList);
    }
}
