package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class NonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            count = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }


            }
            if (count != 2) {
                System.out.println(nums[i]);
                break;

            }

        }
    }
}
