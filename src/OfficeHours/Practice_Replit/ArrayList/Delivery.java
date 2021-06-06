package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Delivery {
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) {
        Integer count = 0;
        for(Integer deliver:deliveries){
            if(deliver<=Integer.valueOf(max_fuel)){
                count++;
            }
            if(deliver>Integer.valueOf(max_fuel)){
                count += deliver/Integer.valueOf(max_fuel);
            }
        }
        return count;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuel_times(list, fuel));

    }
}
