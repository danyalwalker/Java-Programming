package OfficeHours.Practice_Replit.Methods;
import java.util.*;

public class switchLastFirst {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};

        System.out.println(Arrays.toString(do_switch(arr)));

    }


    public static int[] do_switch(int[] i) {

        int first = i[0];
        i[0] = i[i.length-1];
        i[i.length-1] = first;

        return i;

    }
}
