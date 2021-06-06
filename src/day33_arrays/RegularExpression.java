package day33_arrays;

import java.util.Arrays;

public class RegularExpression {
    public static void main(String[] args) {
        //Regular expression is pattern based matching technique.
        // \\d --> any number
        // [A-Z] --> any character from A to Z

        String word = "java1sql2html";
        String[] strArr = word.split("\\d");
        System.out.println(Arrays.toString(strArr));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
    }
}
