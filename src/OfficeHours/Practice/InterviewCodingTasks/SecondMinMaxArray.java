package OfficeHours.Practice.InterviewCodingTasks;

import java.util.Arrays;

public class SecondMinMaxArray {
    public static int secondMin(int [] arr){
        Arrays.sort(arr);
        return arr[1];
    }

    public static int secondMax(int[]arr){
        Arrays.sort(arr);
        return(arr[arr.length-2]);
    }

    public static void main(String[] args) {
        System.out.println(secondMin(new int[]{1, 2, 3, 4, 5}));
        System.out.println(secondMax(new int[]{1, 2, 3, 4, 5}));
    }
}
