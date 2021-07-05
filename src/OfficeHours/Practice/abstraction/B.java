package OfficeHours.Practice.abstraction;

import java.sql.SQLOutput;

public interface B {
    void run();
    public static void stop(){}
    public default void brake(){
        System.out.println("hit the brake!");
    }
}
