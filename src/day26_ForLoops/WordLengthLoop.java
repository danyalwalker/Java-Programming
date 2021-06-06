package day26_ForLoops;

public class WordLengthLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
        /**
         // read first letter of word:
         word.charAt(0);
         // read second letter of word:
         word.charAt(1);
         // read third letter of word:
         word.charAt(2);
         // read fourth letter of word:
         word.charAt(3);
         // read fifth letter of word:
         */

        for (int i = word.length()-1 ; 0 <= i; i--) {
            System.out.println(word.charAt(i));

        }
    }
}

