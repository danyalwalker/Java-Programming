package OfficeHours.Practice.certification.constructors;

public class Lion {
    Lion l = new Lion();
    public static void main(String[] args) {
        new Lion(); // recursive loop with constructor and instance initializer
    }
//    public void roar() {
//        Lion l = new Lion();
//        if ( l == l) {
//            System.out.println("roar!");
//        } }
}
