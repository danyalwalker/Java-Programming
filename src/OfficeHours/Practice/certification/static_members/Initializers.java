package OfficeHours.Practice.certification.static_members;

import java.util.ArrayList;

public class Initializers {
    private static final int NUM_BUCKETS = 45; // static constants have a special naming convention
    private static final ArrayList<String> values = new ArrayList<>();

    public static void main(String[] args) {
        // NUM_BUCKETS = 5; // DOES NOT COMPILE
        values.add("changed");
        values.add("it compiles");
        values.add("reference variable");

    }
}
