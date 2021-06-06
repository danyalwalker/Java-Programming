package OfficeHours.Practice;
import java.util.*;
public class SameLetters {

    public static boolean Same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString( );

        str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

        return  str1.equals(str2);

    }

    public static boolean SameLetters(String a, String b){
        char[] ch1 = a.toCharArray();

        char[]  ch2 = b.toCharArray();

        Arrays.sort(ch1);

        Arrays.sort(ch2);

        String a1="", a2="";

        for(char each: ch1)

            a1 +=each;



        for(char each: ch2)

            a2 +=each;



        return  a1.equals(a2) ;
    }
    public static boolean SameLet(String a, String b){
        boolean check = false;
       String[] arr = new String[a.length()];
        arr = a.split("");
        Arrays.sort(arr);

        String[] arr2 = new String[b.length()];
        arr2 = a.split("");
        Arrays.sort(arr2);
        if( Arrays.toString(arr).equals(Arrays.toString(arr2))){
            check = true;
        }
        return check;
    }

    public static void main(String[] args) {
        System.out.println(SameLetters("abc", "bca"));
        Same("abc", "bca");
    }
}
