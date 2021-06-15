package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveMethod {
    public static ArrayList<String> removeAll(ArrayList<String>wordList, String targetWord){
        ArrayList<String> newArr = new ArrayList<>();
        for(String eachWord:wordList){
            if(!eachWord.equals(targetWord)){
               newArr.add(eachWord);
            }
        }
            return newArr;
    }







    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }

}
