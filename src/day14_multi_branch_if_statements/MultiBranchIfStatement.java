package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 2;

        if (day == 1) {
            System.out.println("it is Monday");

        } else
            System.out.println("not Monday");

        if (day == 2) {
            System.out.println("It is Tuesday");
        }
        if (day == 3) {
            System.out.println("It is Wednesday");
        }

        day = 4;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Java day");
        }


    }
}
