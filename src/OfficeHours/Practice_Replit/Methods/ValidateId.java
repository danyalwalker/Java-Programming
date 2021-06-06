package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class ValidateId {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
        // your code here
        boolean check = false;
        if(notEmpty == true){
            if( taskId == currentId + 1){
                check = true;
            } else {
                check = false;
            }
        }
        return check;
    }





    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
    }
}
