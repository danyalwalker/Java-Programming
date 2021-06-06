package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class MaxMinArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];

        int indexOfMax = 0;

        int indexOfMin = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexOfMax = i;

            }

        }
        System.out.println(max);
        System.out.println(indexOfMax);

        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                indexOfMin = i;
            }

        }
        System.out.println(min);
        System.out.println(nums[0]);
        System.out.println(indexOfMin);
    }
}

