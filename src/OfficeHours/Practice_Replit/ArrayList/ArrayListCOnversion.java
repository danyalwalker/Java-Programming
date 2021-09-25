package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCOnversion {
    public static void main(String[] args) {
        int [] arr = { 15,0,2,0,4,8,0,5,9,0,7,0};
        System.out.println("Arrays.asList(arr) = " + Arrays.asList(arr));

        //List<int[]> list = Arrays.asList(arr);

        List<Integer>list = new ArrayList<>();
        for (int each : arr) {
            if(each != 0){
                list.add(each);
            }
        }

        for(int each : arr){
            if(each==0){
                list.add(each);
            }
        }
        System.out.println(list);
        }

    }

