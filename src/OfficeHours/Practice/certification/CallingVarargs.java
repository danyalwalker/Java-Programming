package OfficeHours.Practice.certification;

public class CallingVarargs {
    public static void run(int[] lengths) { }
    public static void fly(int... lengths) { }

    public static void main(String[] args) {
        run(new int[] {1,2,3});
        fly(1,2,3);
    }
}
