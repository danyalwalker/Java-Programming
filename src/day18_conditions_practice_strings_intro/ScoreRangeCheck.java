package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class ScoreRangeCheck {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        if (score >= 1 && score <= 40) {
            System.out.println("D");
        } else if ( score >= 41 && score <= 60){
            System.out.println("C");
        } else if ( score >= 61 && score <= 90){
            System.out.println("B");
        } else if ( score >= 91 && score <= 100){
            System.out.println("A");
        } else {
            System.out.println("Invalid Score");
        }
    }
}
