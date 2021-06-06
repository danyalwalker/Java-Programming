package day29_NestedLoops;
/**
 * outer from 0 - word.length {
 * char letter = word.charAt(outer);
 * inner from 0 - word.length
 * char innerChar = word.charAt(Inner);
 * if outerChar == innerChar
 * count++;
 * print outerChar + "=" + count
 */
public class CountCharNestedLoops {
    public static void main(String[] args) {
        String word = "java";

        for (int i = 0; i < word.length(); i++) {
            System.out.println("outer: " + word.charAt(i));
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
               // System.out.println(word.charAt(j));

                if (word.charAt(i) == word.charAt(j))
                    count++;
            }
            System.out.println(word.charAt(i) + " = " + count);
        }

    }
}
