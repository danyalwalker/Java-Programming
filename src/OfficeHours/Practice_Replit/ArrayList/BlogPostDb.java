package OfficeHours.Practice_Replit.ArrayList;

import java.util.*;
import java.util.ArrayList;

public class BlogPostDb {
    public static String blogDb(ArrayList<String[]> r, String id) {
        String result = "";
        for(String [] each :r){
            for(int i = 0; i < each.length; i++){
                if(each[0].equals(id)){
                    result = each[1] + "\n" + each[2];
                }
            }
        }

        return result;


    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String id = in.next();
        in.nextLine();
        ArrayList<String[]> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(new String[]{in.nextLine(), in.nextLine(), in.nextLine()});
        }

        System.out.println(blogDb(list, id));

    }
}
