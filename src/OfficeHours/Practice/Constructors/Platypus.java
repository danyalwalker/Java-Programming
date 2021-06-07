package OfficeHours.Practice.Constructors;

public class Platypus {
    String name;
    int num;
    double nums;
    Platypus(String input) {
        name = input;
    }
    Platypus(int num){
        this("moe");
        this.num = num;
    }

    Platypus(double nums){
        this.nums = nums;
    }

    Platypus() {
        this(4);
    }

    public static void main(String args[]) {
        Platypus p1 = new Platypus("digger");
        Platypus p2 = new Platypus(5);
        Platypus p3 = new Platypus();
        System.out.println(p3.num);
        System.out.println(p3.name);

    }
}
