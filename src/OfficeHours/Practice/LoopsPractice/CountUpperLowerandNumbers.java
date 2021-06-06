package OfficeHours.Practice.LoopsPractice;
import java.util.Scanner;
public class CountUpperLowerandNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String wordUpper = "", wordLower = "", wordNumber = "";
        for (int i = 0; i <= word.length()-1; i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
                wordUpper += word.charAt(i);

            }
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                wordLower += word.charAt(i);

            }
            if(word.charAt(i) >= '0' && word.charAt(i) <= '9'){
                wordNumber += word.charAt(i);


            }

        }
        System.out.println(wordUpper.length());
        System.out.println(wordLower.length());
        System.out.println(wordNumber.length());
    }
}
