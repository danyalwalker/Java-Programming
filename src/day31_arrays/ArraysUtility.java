package day31_arrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] nums = { 5,1,7,0, -4, 34,103};
        System.out.println(Arrays.toString(nums));
        // sort
        Arrays.sort(nums);
        // print after sorting
        System.out.println(Arrays.toString(nums));

        String[] languages = { "java", "phyton", "c++","sql","ruby","javascript"};
        System.out.println(Arrays.toString(languages));
        System.out.println("[" + String.join(", ",languages) + "]");

        // Sort languages in alphabetic and Ascii order
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));

        // Sort words in reverse order


        Arrays.sort(languages, Collections.reverseOrder());
        System.out.println(Arrays.toString(languages));
    }
}
