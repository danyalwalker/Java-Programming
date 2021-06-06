package OfficeHours.Practice_Replit.ArrayList;

import java.util.*;

public class Nanuk {
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {
        Integer nkCount = 0;
        Boolean check = false;
        Integer BoastCompareCount = 0;
        if (r.contains("nanuk")) {
            for (String each : r) {
            if (each.equals("nanuk")) {
                nkCount++;
            } else {
                BoastCompareCount += Integer.parseInt(each);
            }
        }
        } else {
            for(String each : r ){
                BoastCompareCount =+ Integer.parseInt(each);
            }
        }

            if(nkCount <= way_stones){

                check = (BoastCompareCount >= boast)? true:false;
            } else {
                check = false;
            }


        return check;





    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(nanuk(list, stones, boast));

    }

}
