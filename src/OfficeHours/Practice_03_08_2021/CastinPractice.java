package OfficeHours.Practice_03_08_2021;

public class CastinPractice {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double
        /*
        by default whole numbers will be read as int datatype
        by default decimal numbers will be read as double datatype
         */


        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d; // int = [(short)double]
        int i2 = (int)d;
        System.out.println(i); // 5
        System.out.println((double)i); // 5.0

        float f = 3.54f;
        float f2 = (float)3.54;

        float f5 = 5; // float = int -> 5.0 compiler thinks this is int, int smaller than float so np
        float f4 = 5.5f; // compiler thinks this is double, double is bigger than float so mention f at end

        long l = 22313; // long > int
        long l2 =321321237646L; // too big for int
        System.out.println(l);
        System.out.println((double)l);
        System.out.println((long)l);
        System.out.println(l2);

        double million = 1_000_000; // java ignores spaces, _ is for space
        System.out.println(million);






    }
}
