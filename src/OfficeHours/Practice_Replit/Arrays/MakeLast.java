package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        int[] newNums = new int[2*size];
        newNums[2*size-1] = nums[size-1];
        System.out.print(Arrays.toString(newNums));


    }
}
