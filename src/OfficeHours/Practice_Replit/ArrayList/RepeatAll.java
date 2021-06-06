package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.*;
public class RepeatAll {
    public static ArrayList<Boolean> repeatAll(ArrayList<Boolean>check){
        int length = check.size();
        for(int i = 0; i< length; i++){
            check.add(check.get(i));
        }

        return check;
    }






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}
