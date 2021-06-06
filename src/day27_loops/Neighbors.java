package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavvaa spoonnn";
        // if tw side by side characters match: signal beep - character
        // aa -> beep - a
        // vv -> beep -v

        for (int index = 0; index < word.length(); index++) {
            System.out.print(word.charAt(index));
            System.out.print(word.charAt(index+1));
            if (word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));
            }
        }

    }
}
