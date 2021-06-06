package day32_arrays_split;

import java.util.Arrays;

/*
Split method in java splits String into Array items by using the delimiter.
 */
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java;python;ruby";
        words.split(";"); // String[] { "java","python","ruby" }
        String[] wordsArray = words.split(";");
        System.out.println(Arrays.toString(wordsArray));

        String words2 = "java is fun";
        words2.split(" ");  //  String[] { "java","is","fun" }
        String[] words2Array = words2.split(" ");
        System.out.println(Arrays.toString(words2Array));

        String words3 = "bengal cat tabby cat persian cat no cat here";
        words3.split("cat"); // String[] { "bangal", "tabby", "persian", "no", "here"}
        String[] words3Array = words3.split("cat");
        System.out.println(Arrays.toString(words3Array));







    }
}
