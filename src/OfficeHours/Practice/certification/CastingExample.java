package OfficeHours.Practice.certification;

public class CastingExample {
    public static void main(String[] args) {
        int ivar = 100;
        long x = 124;
        double dvar = 123;
        dvar = x;
        float fvar = 200F;
        short svar = 12;
        fvar = 300;
        long lvar = 323L;
        lvar = 434;
        Integer Ivar= 13;
        lvar = svar + Ivar;

        int a = (int)23f;
        int b = (int)(23l + 24l);
        float f = (float)12d;
        int j = '3';
        int i = 'b';


        char c = '3';
        byte b1 = (byte)c;
        short s = (short)c;
        int j1 = c;

        int ad = 27;
        long cd = 35;
        ad += cd; // you do not have to make an explicit cast if you're using compound assignment operator


    }
}
