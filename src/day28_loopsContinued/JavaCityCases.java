package day28_loopsContinued;

public class JavaCityCases {
    public static void main(String[] args) {

        //loop day = 1 till day 30
        // everyday 200 new cases
        //  every sunday 500 new cases
        // print "day1 - daily cases: 200"
        // print totalCases =
        int totalCases = 0;
        for (int day = 1; day < 30; day++) {


            if ( day % 7 == 0){
                totalCases += 500;
            } else if(day % 7 != 0){
                totalCases += 200;

        }
            System.out.println(totalCases);

        }
}}
