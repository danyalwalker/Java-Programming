package OfficeHours.Practice.certification.inheritance;

public class Marsupial {

    public  static boolean isBiped() {  // remove static and see the difference between overriding and hiding
        return false; }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
