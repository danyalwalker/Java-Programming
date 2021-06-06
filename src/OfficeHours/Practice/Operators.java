package OfficeHours.Practice;

public class Operators {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2/3%2;



        float d = 100.98324234576f;
        short f = (byte)d;
        byte g = (byte)f;

        long j = 3_000L;
        double k = (float) j;
        System.out.println(k);
        
        int numOne = 10;
        int numThree = numOne++ %2;
        int numTwo = numOne++ * 3 + ++numOne + numOne++%2;

        System.out.println("numThree = " + numThree);
        System.out.println("numTwo = " + numTwo);
        
        int biggest = numOne > numTwo ? numOne:numTwo;
        System.out.println("biggest = " + biggest);
        



    }
}
