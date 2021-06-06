package OfficeHours.Practice_Replit.ArrayList;

import java.util.*;
import java.util.ArrayList;

public class RemoveInstances {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        ArrayList<Integer> newr = new ArrayList<>();
       for(Integer num:r){
           if(num!=n){
               newr.add(num);
           }

        }
        return newr;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(removeInst(list, n));

    }

}
