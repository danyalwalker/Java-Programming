package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class PrintFirstThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for (int i = 0; i < 5 ; i++) {
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(1));
            System.out.println(arr[i].charAt(2));
        }

    }
}