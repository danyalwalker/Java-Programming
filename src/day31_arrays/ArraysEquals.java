package day31_arrays;
import java.util.*;
public class ArraysEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("nums1 == nums2 is " + Arrays.equals(nums1,nums2));
        System.out.println(nums1 == nums2); // ( checks if points to the same object in memory, so it's false )

        if(Arrays.equals(nums1,nums2)){
            System.out.println("nums1 and nums2 match");
        } else{
            System.out.println("nums1 and nums2 do not match");
        }

        System.out.println("cars1 == cars2 is " + Arrays.equals(cars1,cars2));
        System.out.println("cars2 == cars3 is " + Arrays.equals(cars2,cars3));

        // copyOf --> helps copy one array to another

    }
}
