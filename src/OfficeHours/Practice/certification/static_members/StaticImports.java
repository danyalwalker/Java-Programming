package OfficeHours.Practice.certification.static_members;

import java.util.List;
import java.util.Arrays;

//import static java.util.Arrays; // DOES NOT COMPILE import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE
 import static java.util.Arrays.asList; //-- >  this compiles to get the static method asList
public class StaticImports {

    public static void main(String[] args)
    { Arrays.asList("one"); // DOES NOT COMPILE if you dont import Arrays class even if you import asList method.
    }

    public static void check(String[] args) {
        List<String> list = asList("one", "two"); // asList. method comes from the static import in line 8.
    }
    /**
     * Regular imports are for importing classes. Static imports are for importing static members of classes.
     * Just like regular imports, you can use a wildcard or import a specific member.
     * The idea is that you shouldn’t have to specify where each static method or variable comes from each time you use it.
     */
}

