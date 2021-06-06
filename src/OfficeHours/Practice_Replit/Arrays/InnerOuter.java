package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class InnerOuter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for (int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for (int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        boolean check = false;

        for (int i = 0; i < inner.length; i++) {
            int count = 0;
            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    count++;
                }
            }
            if (count != 0) {
                check = true;
            } else {
                check = false;
                break;
            }

        }
        System.out.println(check);



    }
}


            



