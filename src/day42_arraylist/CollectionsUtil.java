package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {


        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));


        char[] letter = ("javaisfun").toCharArray();
        System.out.println(Arrays.toString(letter));
        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');
        System.out.println("after replaceAll " + letters);

        Collections.sort(letters);
        System.out.println(letters);

        List<Integer> nums = Arrays.asList(23, 34, 12, 35, 23, 56, 23, 786, 12);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("after reverse " + nums);

        int max = Collections.max(nums);
        System.out.println("max = " + max);
        int min = Collections.min(nums);
        System.out.println("min = " + min);

        int countOf23 = Collections.frequency(nums, 23);
        System.out.println("countOf23 = " + countOf23);

        Collections.replaceAll(nums, 23, 33);
        System.out.println("after replaceAll = " + nums);

        Collections.sort(nums);
        System.out.println("After sorting = " + nums);

        Collections.shuffle(nums);
        System.out.println("after shuffle" + nums);


    }
}
