package day29_NestedLoops;

public class ArraysIntro {
    public static void main(String[] args) {
        int num; // single variable
        int [] nums = new int[3]; // 1- declare array variable that can store 3 variables
        nums[0] = 5;
        nums[1] = 4;
        nums[2] = 7;
        // nums[3] = 9; -->  outofboundsexception error
        // in java, Arrays are fixed size, not resizable. once declared you can not change the size.
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);

        int i = 0; // we can also use int variable to specify index number
        System.out.println(nums[i]); // 5
        i++;
        System.out.println(nums[i]); // 4

        // how to find the size of the array?
        System.out.println("number of elements = " +nums.length);
        // store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values in the array:
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1]; // read the value of index 1 and assign it to index 2.

        // 2 - Easier way to Declare and assign value in same statement.
        int[] numbs = {234, 12, 343, 545, 234,222, 99};
        System.out.println(numbs.length);
        System.out.println(numbs[0]);

        // 3 - other way to declare and assign value in same statement

        double [] prices = new double[] { 2.34, 5.45, 2.23, 6.54};
    }
}
