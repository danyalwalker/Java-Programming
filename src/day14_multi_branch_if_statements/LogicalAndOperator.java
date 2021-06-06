package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10>5 && 1==1);
        System.out.println(3<5 && 4>4);

        int apples = 10, oranges = 5;
        boolean check = apples > 6 && oranges < 7;
        System.out.println("check = " + check);

        if (apples > 4 && oranges > 3){
            System.out.println("We need not go shopping.");
        } else {
            System.out.println("Let's go to Aldi");
        }

    }
}
