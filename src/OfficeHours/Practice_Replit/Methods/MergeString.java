package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class MergeString {
    public static String mergeStrings(String one, String two) {
        String merge = "";
        for(int i = 0; i < one.length(); i++){
            String a = one.charAt(i) + "";
            for(int j = 0; i < two.length(); j++){
                String b = two.charAt(j) + "";
                if(i==j){
                    merge += a+b;
                    break;
                }
            }

        }
        if(one.length()>two.length()){
            merge += one.substring(two.length());
        } else if(two.length()>one.length()){
            merge += two.substring(one.length());
        }
        return merge;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
