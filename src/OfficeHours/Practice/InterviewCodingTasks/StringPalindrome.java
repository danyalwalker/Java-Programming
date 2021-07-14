package OfficeHours.Practice.InterviewCodingTasks;

public class StringPalindrome {

    public static boolean palindrome(String word){
            boolean isPalindrome = false;
        for (int i = 0, j = word.length()-1; i < word.length()/2; j--,i++) {
            if(word.charAt(i) == word.charAt(j)){
                isPalindrome = true;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("tarat"));
    }
}
