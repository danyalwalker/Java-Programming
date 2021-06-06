package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words.length; j++) {
                if(i!=j){
                    if( words[i].equals(words[j])){
                        count++;
                    }
                }

            }
            if( count==0){
                System.out.println(words[i]);
            }

        }


    }
}
