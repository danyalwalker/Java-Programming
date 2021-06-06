package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        int total = 0;
        for (int i = 0; i < size ; i++) {
            nums[i] = scan.nextInt();
        }

        for (int i = 0; i < size ; i++) {
            total += nums[i];
        }

        System.out.println(total/size);



    }
}
