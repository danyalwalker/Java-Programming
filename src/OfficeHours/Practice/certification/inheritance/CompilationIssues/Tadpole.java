package OfficeHours.Practice.certification.inheritance.CompilationIssues;

import OfficeHours.Practice.certification.polymorphism.Frog;

public class Tadpole extends Frog {
    public Tadpole(){
        type = "Animal";
    }
    public static void main(String[] args) {

        Tadpole t = new Tadpole();
        t.ribbit();
        // t.jump(); jump() is not deafult and in different package so does not compile
        Frog f = new Tadpole();
       // f.ribbit(); // ribbit is protected and f is Frog class reference , so it is not subclass reference
       // f.jump();   // jump is default and is in another package, so no access to it.
        f.sleep();
    }
}
