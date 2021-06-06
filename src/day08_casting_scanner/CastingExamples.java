package day08_casting_scanner;

public class CastingExamples {
    public static void main(String[] args) {
        // byte - short - int - long

        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;

        System.out.println(num4);

        float num5 = 124.4F;
        double num6 = num5;
        System.out.println(num5);
        
        int num7 = 3456;
        double num8 = num7;
        System.out.println(num8);
        System.out.println("num8 = " + num8);

        int num9 = 273;
        byte num10 = (byte)num9;// byte num10 = num9 wont work since int is larger in size than byte.
        short num11 = num10;
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        
        double num13 = 55.3;
        float num14 = (float)num13;
        System.out.println("num14 = " + num14);

        double num15 = 1234.5;
        int num16 = (int)num15;
        System.out.println("num16 = " + num16); // result is with no decimals

        char letter = 'M';
        int numletter = letter;
        System.out.println("numletter = " + numletter);
        // if you assign a char into int that number will be assigned succesfuly

        char ch = 'J'; // J refers to 74 in ascii table
        int num20 = ch;
        System.out.println("num20 = " + num20);

        /*
        SUMMARY:
        casting/converting primitives. We can cast primitives from one to another.

            from smaller to larger -> automatic casting/ conversion
            from larger to smaller -> explicit/manual we need to use ()
            byte-short-int-long-float-double
            char -> can cast to int
            boolean -> no casting
            if you cast/convert from decimal to whole number, it will remove decimal point and value.
         */

    }
}
