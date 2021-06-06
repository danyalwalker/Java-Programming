package OfficeHours.Practice_03_02_2021;

public class awe {
    public static void main(String[] args) {
       int i =100;
       double d =123;
       float f= 300;
      // i=f; won't compile
       f=i;
       d=f;
     //  f=d; won't compile
       d=i;
      // i=d; won't compile

    }
}
