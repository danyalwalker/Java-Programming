package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class LongestShortestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }
        String max = "";
        for (int i = 0; i < words.length ; i++) {
           if (words[i].length() > max.length()){
               max = words[i];
           }
        }
        System.out.println(max);

        String min = words[0];
        for(String each : words){
            if(each.length() < min.length()){
                min = each;
            }
        }
        System.out.println(min);

    }
}
