package OfficeHours.Practice_Replit.Loops;

public class Reverse2ndWord {
    public static void main(String[] args) {
        String word = "I love java";

       String lastTwo = word.substring(word.indexOf(" ")+1);
       String last = lastTwo.substring(lastTwo.indexOf(" ")+1);
       String theWord = lastTwo.replace(last,"");

       String reverse = "";
        for (int i = theWord.length()-1; i>=0 ; i--) {
                  reverse +=  theWord.charAt(i);
        }
        System.out.println(reverse);
    }
}
