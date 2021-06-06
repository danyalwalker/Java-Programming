package day37_methos_overloading;

public class VarArgs {
    // Var-Args is used as a method parameter, and will allow ability to pass 0 or more values separated by comma.
    // var-args can only be used as a method parameter
    public static void sum(int... nums){
        // inside the method, it is used as regular array.
        int total = 0;
        for(int n: nums){
            total+=n;
        }
        System.out.println("total = " + total);
    }

    public static void main(String[] args) {
        sum();
        sum(1);
        sum(1,2);
        sum(1,3,7);
        sum(2,3,5,67,7,889,99,5);
    }

}
