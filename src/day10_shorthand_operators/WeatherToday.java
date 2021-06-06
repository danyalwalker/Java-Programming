package day10_shorthand_operators;
import com.sun.javafx.logging.JFRInputEvent;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.nextLine();
        System.out.println("The weather is " + weather + " today!");
        /*
         next() | nextLine()
         next() only accepts String until first space, it will not accept the second character
         after space. Instead when using nextLine() it will accept all words until you press enter.

        String words = scan.nextLine();
        words = "wooden spoon is the best spoon in planet";
        System.out.println(words);

         */


    }
}
