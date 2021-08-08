package OfficeHours.Practice.certification.overloading_methods;

/**
 * creat- ing methods with the same signature in the same class.
 * Method overloading occurs when there are different method signatures with the same name but different type parameters.
 * Everything other than the method signature can vary for overloaded methods.
 */
public class SameClass {

    public void fly(long numFeet) {
        System.out.println("long");
    }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    public void fly(int numMiles) {
        System.out.println(57);
    }
  //  public int fly(int numMiles) { } // DOES NOT COMPILE same name, same param


    public void fly(int... lengths) { }
   // public void fly(int[] lengths) { }  // DOES NOT COMPILE java treat varargs as array

    public static void run(int numMiles) {
        System.out.println(numMiles);
    }
    public  static void run(Integer numMiles) {
        System.out.println(numMiles);
    }

    public void fly(String s) {
        System.out.print("string "); }
    public void fly(Object o) {
        System.out.print("object ");
    }
    public static void play(Long... l) {
        System.out.println("long varargs");
    }
    public static void show(Long l) {
        System.out.println("Long wrapper");
    }

    public static void main(String[] args) {
        run(3); // practice autoboxing and unboxing
        run(new Integer(5));

        SameClass s = new SameClass();
        s.fly("test");  // java picks the most specific one
        s.fly(43);
        s.fly(123L); // If we comment out the overloaded method with the int parameter list, the output becomes long long.Java has no problem calling a larger primitive.
        s.fly(new Object());
        /**
         *  priority for calling numbers --> exact match - int, larger primitive - long, autoboxing - Integer, Varargs - int ... nums
         */
        play(4L);
        // show(4); does not compile since int to long, long to Long is two step function which is not allowed.
    }
}
