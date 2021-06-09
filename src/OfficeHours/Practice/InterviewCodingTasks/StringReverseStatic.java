package OfficeHours.Practice.InterviewCodingTasks;

import java.util.Scanner;

public class StringReverseStatic {
    public static void main(String[] args) {

        StringReverseStatic rev = new StringReverseStatic();
        rev.reverseStr();
    }
    ;

    public void reverseStr() {
        // create variable to store reversed version of str
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reverse = "";

        //       01234
        //str = "apple";
        // iterate over input string from the back with charAt
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i) + "";
            // add chars to reversed variable
            //  reverse.append(String.valueOf(str.charAt(i)));
        }

        System.out.println(reverse);
        // convert to string and return reversed version

    }






    // Time Complexity: O(n)
    // Using StringBuilder will be more efficient than String
    // String is immutable and concatenation in the loop will create many String objects


}
