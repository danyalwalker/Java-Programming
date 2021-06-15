package OfficeHours.Practice_Replit.Arrays;

import java.util.Scanner;

public class GetDuplicateMethod {
    public static int getDup(String[] r) {
        int count = 0;
        int total = 0;
        for(int i = 0; i< r.length; i++){
            count=0;
            for(int j = 0; j< r.length; j++){
                if(i!=j && r[i].equals(r[j])){
                    count++;
                }
            }
            if(count>=1){
                total++;
            }
        }

        return total;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
