package OfficeHours.Practice.abstraction;

public interface C {
    void jump();
    public default void slide(){
        System.out.println("slide");
    }
}
