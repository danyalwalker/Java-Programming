package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class StringPalindrome {

    public static boolean isPalindrome(String check) {

        // your code here
        boolean palindrome = false;
        String temp1 = check.replace(" ", "").toLowerCase();
        String temp2 = "";
        for (int i = 0, j = temp1.length() - 1; i < temp1.length() / 2; i++, j--) {
            if (check.contains(" ")) {
                if (temp1.charAt(i) == temp1.charAt(j)) {
                    palindrome = true;
                }

            }
        }
            for ( int i = 0, j = check.length() - 1; i < check.length() / 2; i++, j--) {
                if (!check.contains(" ")) {
                    temp2 = check.toLowerCase();
                    if (temp2.charAt(i) == temp2.charAt(j)) {
                        palindrome = true;
                    }

                }
            }
        return palindrome;
        }








    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
