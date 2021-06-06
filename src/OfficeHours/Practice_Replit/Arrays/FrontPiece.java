package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class FrontPiece {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        int [] newArr =(size >= 2)? new int [] {num[0], num[1]} : new int [] {num[0]};



        System.out.print(Arrays.toString(newArr));

    }
        }

