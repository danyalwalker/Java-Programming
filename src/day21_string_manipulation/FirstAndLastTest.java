package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom"; // palindrome word --> word that reads same on each way
        char first = word.charAt(0);
        char last = word.charAt(2);

        if ( first == last ){
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters don't match");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        char lastLetter = friend.charAt(friend.length() - 1);
        System.out.println(lastLetter);

        if ( firstLetter == lastLetter ){
            System.out.println("first and last letters match");
        } else {
            System.out.println("first and last letters don't match");
        }
    }
}
