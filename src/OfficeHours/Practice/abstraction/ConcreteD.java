package OfficeHours.Practice.abstraction;

public class ConcreteD extends A implements B, C{

    public ConcreteD(String e, int f){
        System.out.println("Go to " + e + f + "times");
    }

    @Override
    void come() {
        System.out.println("come here");
    }

    @Override
    void go() {


    }

    @Override
    public void run() {

    }

    @Override
    public void brake() {
        B.super.brake();
    }

    @Override
    public void jump() {
        System.out.println("start jumping");

    }

    @Override
    public void slide() {
        C.super.slide();
        System.out.println("slide more");
    }
}
