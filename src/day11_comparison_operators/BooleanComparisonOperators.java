package day11_comparison_operators;

import java.sql.SQLOutput;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(237<874);
        System.out.println(10<=11);
        System.out.println(10<=10);
        System.out.println(23!=34);


        int a = 100;
        int b = 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        
        boolean result = 5==5;
        System.out.println("result = " + result);
        result = 33 > 44;
        System.out.println("result = " + result);
        result = 33>=33;
        System.out.println("result = " + result);

        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Baku");
        
        
        String name = "Nadir";
        boolean checkName = name == "Nadir";
        System.out.println("checkName = " + checkName);
        
        checkName = name != "Kuzzat";
        System.out.println("checkName = " + checkName);

        int n1 = 5;
        int n2 = 3;
        System.out.println( n1 == n2); // false

        boolean check = n1 == n2;
        System.out.println(check); //false

        boolean check2 = n2 > n1;
        System.out.println(check2); //false


        int age = 2;

        boolean noNoreToddler = age > 3;
        System.out.println(noNoreToddler); //false

        age =66;
        boolean seniorCitizen = age > 65;
        System.out.println("is senior citizen? " + seniorCitizen);//true




    }
}
