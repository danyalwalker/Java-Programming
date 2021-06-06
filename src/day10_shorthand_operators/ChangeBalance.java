package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        balance = balance - baklava;
        System.out.println("balance = " + balance);

        double kunefe = 44.45;
        System.out.println("kunefe = " + kunefe);
        balance = balance - kunefe;
        System.out.println("balance = " + balance);

        double icedtea = 2.95;
        System.out.println("icetea = " + icedtea);
        balance = balance - 3 * icedtea;
        System.out.println("balance after 3 iced teas = " + balance);

        // lets return the baklava
        balance = balance + baklava;
        System.out.println("After returning baklava balance will be " + balance);

    }
}
