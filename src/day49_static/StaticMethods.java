package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
       // System.out.println("num " + num); // Error: num is instance variable. static can not accept
        System.out.println("count " + count); // no error. count is static variable

    }

    public static void anotherStaticVariable() {
        System.out.println("snother Static method");
        displayMessage("wooden spoon");
    }

    //StaticMethods.instanceMethods() -> NO
    // StaticMethods stm = new StaticMethod();
    // stm.intanceMethod();

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");
    }

    }

