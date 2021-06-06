package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class ZombieAttack1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter City Populations:");
        int [] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int[] compare = new int[8];
        int day =0;
        System.out.println("Day "+ day + " " + Arrays.toString(inhabitants));
        while(!Arrays.toString(inhabitants).equals(Arrays.toString(compare))){
            for (int j = 0; j < 8 ; j++) {
                inhabitants[j] /= 2;

            }
            System.out.println("Day "+ day + " " + Arrays.toString(inhabitants));
            day++;

        }

        System.out.println("---- EXTINCT ----");
    }
}








