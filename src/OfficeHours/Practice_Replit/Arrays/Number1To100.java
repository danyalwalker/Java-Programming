package OfficeHours.Practice_Replit.Arrays;

import java.util.Arrays;

public class Number1To100 {
    public static void main(String[] args) {
        int[] numsArray = new int [100];
        for (int i = 0; i < 100; i++) {
            numsArray[i] = i;
        }
        for(int each:numsArray){
            System.out.print(each + " ");
        }
            System.out.println();


        int[] numbArray = new int [100];
        for (int j = 0; j < numbArray.length ; j++) {
            numbArray[j] = j;
            System.out.print(j + " ");
           // int eachnum = numbArray[j];
           // System.out.print(eachnum + " ");


        }
        System.out.println();
        System.out.println(Arrays.toString(numbArray));
    }
}
