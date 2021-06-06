package OfficeHours.Practice_Replit.Arrays;
import
        java.util.*;
public class Print3NeighborString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = scan.next();
        }


        for (int i = 0; i < 6 ; i++) {

                System.out.println(arr[i] + ", " + arr[i+1] + ", " + arr[i+2]);


        }


    }
}
