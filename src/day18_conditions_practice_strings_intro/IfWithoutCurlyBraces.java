package day18_conditions_practice_strings_intro;

import java.sql.SQLOutput;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";
        if(todaysClass.equals("java"))
            System.out.println("java is fun");


        // it's better to have curly braces, no benefit of skipping them.
        // It wont print the second line when you don't have curly braces since it is not related to if block.
        //Always use curly braces, you don't go wrong.

        int a =1;
        if( a ==1)
            System.out.println("a is 1");
            System.out.println("1 is a");

    }
}
