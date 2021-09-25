package OfficeHours.Practice.certification.overloadingParams;

public class FloatOrDouble {

    public static void main(String[] args) {
        doSum(10.0,20.0);
        doSum(10,20);
    }

    public static void doSum(float x,float y){
        System.out.println("float");
    }
    public static void doSum(Double x, Double y){
        System.out.println("double");
    }
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer");
    }
    public static void doSum(int x, int y){
        System.out.println("int");
    }
}
