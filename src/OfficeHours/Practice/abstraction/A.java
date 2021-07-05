package OfficeHours.Practice.abstraction;

public  abstract class A implements B,C{
   abstract void come();
   abstract void go();
   public static void lay(){
       System.out.println("lay down and relax");
   }

    @Override
    public void run() {
        System.out.println("Run faster");
    }
}
