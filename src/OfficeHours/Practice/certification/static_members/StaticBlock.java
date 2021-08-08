package OfficeHours.Practice.certification.static_members;

public class StaticBlock {
    private static int one;
    private static final int two;
    private static final int three = 3;
 //   private static final int four; compile error, you did not initialize in static block. static final can only be initialized in static block

    static {
        one = 1;
        two = 2;
       // three = 3; once final value assigned, you can not reassign.
   //     two = 4; compile error, constants can only be assigned once in static block

    }

}
