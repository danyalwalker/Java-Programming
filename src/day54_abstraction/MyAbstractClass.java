package day54_abstraction;

public abstract class MyAbstractClass {
int num = 55;
public void learn(){
    System.out.println("Learninf..");
}
    public abstract void close();

}

class Sub extends MyAbstractClass{
    public void close(){
        System.out.println("Close - abstract method implementation");
    }
}

class MyObjects {
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.close();
    }
}