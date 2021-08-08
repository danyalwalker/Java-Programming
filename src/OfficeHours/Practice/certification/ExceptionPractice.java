package OfficeHours.Practice.certification;

import java.util.Arrays;
import java.util.List;

public class ExceptionPractice {
    public static void main(String[] args) {
        String letters = "abcdef";
        //System.out.println(letters.charAt(6));
        System.out.println(letters.length());
        System.out.println(letters.charAt(3));

        String[] arr1 ={"1", "hey"};
        String[] arr2 ={"1", "hey"};
        System.out.println((arr1.equals(arr2)));

        List<String> list1 = Arrays.asList(arr1);
        List<String> list2 = Arrays.asList(arr1);
        System.out.println(list1.equals(list2));

        int[] random = { 6, -4, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        String s = String.valueOf(x);
        System.out.println((s + x));
        int i = Integer.parseInt(s);
        Integer integer = Integer.valueOf(s);
    }
}
