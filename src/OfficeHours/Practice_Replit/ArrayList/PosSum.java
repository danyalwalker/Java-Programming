package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PosSum {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){
        ArrayList<Integer> pSum = new ArrayList<>();
        Integer sum = 0;
        for(Integer num: nums){
            if(num > 0){
                pSum.add(num);
                sum += num;
            }

        }
        pSum.add(sum);

        return pSum;
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
