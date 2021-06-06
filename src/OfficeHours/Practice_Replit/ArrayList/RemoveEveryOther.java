package OfficeHours.Practice_Replit.ArrayList;

import java.util.*;
import java.util.ArrayList;

public class RemoveEveryOther {




        public static List<String> removeEveryOther (ArrayList < String > words) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < words.size(); i++) {
                if (i % 2 == 0) {
                    list.add(words.get(i));
                }
            }
            return list;
        }


        // Do not touch below

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(in.next());
            }

            System.out.println(removeEveryOther(list));

        }

    }

