package OfficeHours.Practice.certification.Arrays;

public class ForEachArray {
    public static void main(String[] args) {
        int []data = {1,2,3,4,3};
        int k = 3;
        int count = 0;

        for (int each : data) {
            if(each != k){

                continue;

            //   count++;  compile error due to unreachable statement


            }
        }
        System.out.println(count + "found");
    }
}
