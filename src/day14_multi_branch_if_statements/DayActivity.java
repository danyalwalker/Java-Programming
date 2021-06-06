package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "stormy";
        if (weather.equals("sunny")) {
            System.out.println("Go to park!");
        } else if (weather.equals("rainy")) {
            System.out.println("Stay at home and code java!");
        } else if (weather.equals("snowy")) {
            System.out.println("Go to skiing!");
        } else if (weather.equals("windy")) {
            System.out.println("Go outside and fly a kite!");
        } else {
            System.out.println("Keep coding java!");}

        }
    }
