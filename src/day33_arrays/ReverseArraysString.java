package day33_arrays;

import java.util.Arrays;

public class ReverseArraysString {
    public static void main(String[] args) {
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        // i -> 2, j -> 2                     2
        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }

        System.out.println("words after reverse = " + Arrays.toString(words));
    }
}

