package OfficeHours.Practice.certification.inheritance;

public class Kangaroo extends Marsupial{

    public  static boolean isBiped() {  // remove static and see the difference between overriding and hiding
        return true; }

    public void getKangarooDescription() { System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
        System.out.println(joey.isBiped());
        Marsupial haley = new Marsupial();
        System.out.println(haley.isBiped());
        haley.getMarsupialDescription();

    }
}
