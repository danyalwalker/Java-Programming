package OfficeHours.Practice_Replit.Loops;
import java.util.*;
public class practice {
    public static void main(String[] args) {
int [] words = { 14,1,84,97,1243,46};
int total =0;


        for (int i = 0; i < words.length ; i++) {
          if(words[i]%2!=0){
              total+=5;
          }else{
              total+=10;
          }

        }
        System.out.println(total);
    }

}
