package OfficeHours.Practice.LoopsPractice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);
        String word = scan.next();
        String word2 = "";

        for (int i = word.length()-1; 0 <= i; i--) {
            word2 += word.charAt(i);
        }
            if(word.equals(word2)){
                System.out.println(true);
            }else {
                System.out.println(false);
            }


        boolean isPalindrome = true;
        for (int i = 0; i < word.length()/2 ; i++) {
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                isPalindrome=false;
                break;
            }

        }
        System.out.println(isPalindrome);
    }
}
