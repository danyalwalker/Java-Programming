package OfficeHours.Practice.certification;

public class MethodsExamples {
    public static void main(String[] args) {
        walk(1); // 0 20:
        walk(1, 2); // 1
        walk(1, 2, 3); // 2 22:
        walk(1, new int[] {4, 5});

        run(11, 22); // 22
    }
  //  String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE since return is not guaranteed
  public static void walk(int start, int... nums) {
        System.out.println(nums.length);
      }

    public static void run(int... nums) {
        System.out.println(nums[1]);
    }
}
