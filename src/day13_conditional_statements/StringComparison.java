package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")){
            System.out.println("it is LA");
        }else {
            System.out.println("It is not LA");
        }

        String weather = "sunny";

        if (weather.equals("sunny")){
            System.out.println("Let's go out ");
        } else{
            System.out.println("Stay home!");
        }
        String each = "lead;";
        System.out.println((each.contains("lea")));

    }
}
