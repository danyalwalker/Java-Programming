package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    public  static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
       for(Integer num : nums){
           nums.set(nums.indexOf(num),num*2);
       }
        return nums;
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));

    }
}
