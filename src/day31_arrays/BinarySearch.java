package day31_arrays;
import java.sql.SQLOutput;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {543,23,154,12,245};
        System.out.println(Arrays.toString(nums));
        int [] nums2 = {23,154};
        // need to sort in order to search
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.binarySearch(nums, 12)); // 0
        System.out.println(Arrays.binarySearch(nums, 23)); // 1
        System.out.println(Arrays.binarySearch(nums, 154)); // 2

        if( Arrays.binarySearch(nums,23) > 0){
            System.out.println("23 is included in the arrays");
        }


    }
}
