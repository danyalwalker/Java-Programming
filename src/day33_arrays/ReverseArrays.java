package day33_arrays;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100};
        int[] numsRev = new int[nums.length];
        // int numsRev = {0,0,0,0};  by default all values are 0 when declared
        for(int i = nums.length -1,j = 0; i >=0; i--, j++){
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));

        System.out.println("swap values  using additional variable");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 30;
        System.out.println("num2 = " + num2);
        // swap values  using additional variable
        int temp = num1;
        num1 = num2;
        System.out.println("num1 = " + num1);
        num2 = temp;
        System.out.println("num2 = " + num2);

        int[] numbers = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(numbers));

        temp = numbers[0];
        numbers[0] = numbers [3];
        numbers[3] = temp;
        System.out.println("after 1st and last swap: " + Arrays.toString(numbers));

        int[] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2));
        //2
        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2;
        }

        System.out.println("After: " + Arrays.toString(nums2));
    }


}
