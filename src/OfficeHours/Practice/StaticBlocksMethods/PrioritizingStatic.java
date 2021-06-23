package OfficeHours.Practice.StaticBlocksMethods;

public class PrioritizingStatic {
static int z = 5;
int n=10;

    public static void main(String[] args) {
      //  run();
        System.out.println(2);
        System.out.println(z);


    }
    static void run(){
        System.out.println(1);
    }
    static{
        System.out.println(3);
    }

}
