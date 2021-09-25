package a_oca.q080;

public class NewClass {

}
class superclass {
    void print()
    {
        System.out.println("print in superclass.");
    }
}
 class subclass extends superclass {

    void print()
    {
        System.out.println("print in subclass.");
    }


    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass(); // As per polymorphism, sublass has only access to parent class methods, but overridden methods apply runtime polymorphism and overridden method runs
        subclass C = new subclass();
        A.print();
        B.print();
        C.print();
    }
}
