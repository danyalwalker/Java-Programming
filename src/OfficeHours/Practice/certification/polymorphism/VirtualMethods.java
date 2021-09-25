package OfficeHours.Practice.certification.polymorphism;

public class VirtualMethods {
}
class Bird {

    public String getName() {
        return "Unknown"; }

    public void displayInformation() {
        System.out.println("The bird name is: "+getName());
    }
}

class Peacock extends Bird {
    public String getName() {
    return "Peacock"; }

    public void noName(){
        System.out.println(getName());
    }

    public static void main(String[] args) {
        Peacock peacock= new Peacock();
        peacock.displayInformation();
        peacock.noName();

        Bird bird = new Peacock();
        bird.displayInformation(); // prints overridden version since original is also in Bird class.
       // System.out.println(bird.noName()); compile error, since bird instance has no access to Peacock class methods unless overridden from Bird class.
    }
}