package day37_methos_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        sum(2,3,4);
        sum(2.0,3);
        sum("Hello","World");
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static String sum( String a, String b){
        return a + b;
    }
}
