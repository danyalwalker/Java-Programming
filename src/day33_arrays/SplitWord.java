package day33_arrays;

import java.util.Arrays;

public class SplitWord {
    public static void main(String[] args) {
        String word = "hello_world";
        String[] strArr = word.split("o");
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);
        int countofO = strArr.length - 1;

        String word2 = "ajava";
        String[] strArr2 = word2.split("a");
        System.out.println(Arrays.toString(strArr2));
        System.out.println(strArr2.length);
        int countofA = strArr.length - 1;
        if (word.endsWith("a")){
            countofA++;
        }

        String[] strArr3 = word2.split("");
        System.out.println(Arrays.toString(strArr3));
    }
}
