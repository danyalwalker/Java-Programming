package OfficeHours.Practice_Replit.Methods;
import java.sql.SQLOutput;
import java.util.*;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int num){
        //WRITE YOUR CODE HERE
        int originalNumber = num;
        int reminder = 0;
        int reversedNumber = 0;
        for (; num != 0;) {

            reminder = num % 10;
            reversedNumber = reversedNumber * 10 + reminder;
            num = num / 10;
        }

        System.out.println(reversedNumber==originalNumber);

    }
}
