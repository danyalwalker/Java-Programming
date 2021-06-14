package OfficeHours.Practice.InterviewCodingTasks;

public class ReverseWords {
    public static String  reverseWord(String word){

        String  reverseWord ="";
        for (int i = word.length()-1; 0<=i ; i--) {
            if(word.charAt(i) == ' '){
                continue;
            }
            reverseWord += word.charAt(i);
        }
        return reverseWord;
    }

    public static void main(String[] args) {
        reverseWord("selenium");
    }

}
