package OfficeHours.Practice.certification.collections_examples;

import java.util.ArrayList;
import java.util.List;

public class RemoveList {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if(names.remove("Bran")) {
            names.remove("John");
        }
        System.out.println(names);

        System.out.println("Integer.valueOf('a') = " + Integer.valueOf('a'));
       // System.out.println("Integer.parseInt('b') = " + Integer.parseInt('b')); compile error
        System.out.println("Integer.valueOf(\"true\") = " + Integer.valueOf("true"));
        int b = 4;
        List l1 = new ArrayList<>();
        l1.add(b);
    }
}
