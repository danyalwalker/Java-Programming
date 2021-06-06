package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class CertainValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].contains("e")) {
                count++;
            }

        }
        int k = 0;
        String[] fewValues = new String[count];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].contains("e")) {
                fewValues[k] = arr[i];
                k++;
            }

        }
        return fewValues;
    }

}