package day38_methods;

public class ArraysUtilsTest {
    public static void main(String[] args) {
      int[] nums = {3,23,34,21};
        ArraysUtils.printArray(nums);
        ArraysUtils.printArray(new int[]{21,54,34,12,543,2,87,3,23});

        System.out.println("ArraysUtils.sum(nums) = " + ArraysUtils.sum(nums));
        System.out.println("ArraysUtils.sum(new int[]{21,54,34,12,543,2,87,3,23}) = " + ArraysUtils.sum(new int[]{21, 54, 34, 12, 543, 2, 87, 3, 23}));

        System.out.println("ArraysUtils.contains(nums,3) = " + ArraysUtils.contains(nums, 3));
        int[] nums2 = {12,32,43,56,87,45,34};
        System.out.println("ArraysUtils.contains(nums2,12) = " + ArraysUtils.contains(nums2, 12));
    }
}
