package OfficeHours.Practice_Replit.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameDb2 {
    public static String lameDb(String db, String op, String id, String data) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(db.split("#")));
        String dbFinal = "";
        if(op.equals("add")){
            list.add(Integer.parseInt(id) -1,id+data);
        } else if(op.equals("edit")){
            list.set( Integer.parseInt(id) -1,id+data);
        } else if(op.equals("delete")){
            list.remove( Integer.parseInt(id) -1);
            for(String each: list){
                dbFinal += "#" + each;
            }
            dbFinal = dbFinal.substring(1);
            return dbFinal;
        }


        for (int i = 1; i <= list.size() ; i++) {


           dbFinal += "#" + i + list.get(i-1).substring(1);
       }
            dbFinal = dbFinal.substring(1);


        return dbFinal;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }
}
