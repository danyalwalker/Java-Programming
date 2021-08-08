package OfficeHours.Practice.certification;


import java.util.Random;


public class JavaBook {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("random.nextInt(10) = " + random.nextInt(10));
        System.out.println(Float.MAX_VALUE);
        int hexademical = 0X55F; // digits 0-9 and letters A-F --> prefix 0X or 0x
        int octal = 014; // digits 0-7 and prefix is 0
        int binary = 0b11; // digits 0-1 and prefix 0B or 0b
        System.out.println("hexademical = " + hexademical);
        System.out.println("octal = " + octal);
        System.out.println("binary = " + binary);

        java.util.Scanner scan;
        scan = new java.util.Scanner(System.in);

        String s = null;  // it does not refer to an object
        int num = 0; // primitive value can not be null

        double d1,d2,d3;
        double d4, d5 =3.0;
        System.out.println(d5 );
        float y = 2.1F;
        float z = 23L;
        int x = (int)23L;

        short a = 10;
        short b = 5;
        short c = (short)(a*b);
        int d = a/b;
        short num1 = (short) 19232455; //overflow
        System.out.println("num1 = " + num1);

        long i = 5;
        long j = (i=3);
        System.out.println("i: " + i); // Outputs 3
        System.out.println("j:" + j); // Also, outputs 3

        int k = 6;
        boolean h = (k >= 6) || (++k <= 7);
        System.out.println("k: "+ k);

        System.out.println((5 == 5.00));
        System.out.println((5.00 == 5));
    }
    public void findAnswer(boolean check) {
        check =  true;
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1; } else {
            answer = 2; }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }

    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
        if(bitesOfCheese>0){
            int tinybit = bitesOfCheese;
            System.out.println(tinybit);
        }
       // System.out.println(tinybit); does not compile since it is out of scope of the block it is declared in.
    }



}
