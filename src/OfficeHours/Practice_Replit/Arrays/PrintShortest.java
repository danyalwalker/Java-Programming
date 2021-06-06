package OfficeHours.Practice_Replit.Arrays;
import java.util.*;
public class PrintShortest {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            String[] strArr = str.split(", ");
           int shortest = strArr[0].length();
           String shortPrint = "";
        for (int i = 0; i < strArr.length ; i++) {
            if(shortest >= strArr[i].length() ){
                shortest = strArr[i].length();
            }

        }
        for (int i = 0; i < strArr.length ; i++) {
            if (strArr[i].length() == shortest) {
                shortPrint += strArr[i] + ", ";
            }
        }
        String[] shortArr = shortPrint.split(", ");
        Arrays.sort(shortArr);
        System.out.println(Arrays.toString(shortArr));

    }
}
