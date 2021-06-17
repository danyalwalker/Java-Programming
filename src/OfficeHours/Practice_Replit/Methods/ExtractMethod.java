package OfficeHours.Practice_Replit.Methods;

import java.util.Scanner;

/**
 * ctrl + space --> gives suggesstions
 * Select code > right click > Refactor > Extract method
 */
public class ExtractMethod {

    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner input = new Scanner(System.in);
        int [] nums = new int[input.nextInt()];
        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];
        extracted(nums, evenNumbers, oddNumbers);


    }

    private static void extracted(int[] nums, int[] evenNumbers, int[] oddNumbers) {
        for(int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenNumbers[e++] = nums[i]; // 1
            } else {
                oddNumbers[o++] = nums[i];
            }
        }
    }
}
