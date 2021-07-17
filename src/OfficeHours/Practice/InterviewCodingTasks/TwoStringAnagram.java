package OfficeHours.Practice.InterviewCodingTasks;

import java.util.Arrays;

public class TwoStringAnagram {
    public static boolean isAnagram(String a, String b){
        boolean isAnagram = true;
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            count = 0;
            for (int j = 0; j < b.length(); j++) {
                if(a.charAt(i) == b.charAt(j)){
                    count++;
                }

            }
            if(count>=1){
                continue;
            } else{
                isAnagram = false;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
       // System.out.println(isAnagram("kale", "ekal"));
        System.out.println(isAnagram("halil", "lahik"));
        System.out.println(isAnagram2("halil", "lahik"));

    }

    public static boolean isAnagram2(String str, String str1) {
        // convert both String to char[]
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return Arrays.equals(arrStr, arrStr1);
    }
}
