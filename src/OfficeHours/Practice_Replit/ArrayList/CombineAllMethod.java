package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAllMethod {
    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne,ArrayList<Integer> numbersTwo ){

        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0 ; i<=numbersOne.size()-1; i++){
            newList.add(numbersOne.get(i));
        }
        for (int i = 0 ; i<=numbersTwo.size()-1; i++){
            newList.add(numbersTwo.get(i));
        }

        return newList;

    }






    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAll(list, list2));

    }
}
