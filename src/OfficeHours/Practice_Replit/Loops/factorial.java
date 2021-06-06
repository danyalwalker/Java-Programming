package OfficeHours.Practice_Replit.Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        long fact = 1;
        int i = 1;
        /*
        while(i<=n)
        {
            fact = fact * i;
            i++;
        }
        System.out.print(fact);
*/
        for (i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);

    }


}

