package day37_methos_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(4));
        for (int day = 1; day < 8 ; day++) {
            System.out.println(getDayName(day));
            
            String today = getDayName(5);
            System.out.println("today = " + today);

            String someDay = getDayName(0);
            if(someDay==null){
                System.out.print("someDay is null for invalid day");
            }

        }
    }


    public static String getDayName(int day){

        switch(day){
            case 1:
               return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6 :
                return "Saturday";
            case 7 :
                return "Sunday";
            default:
                System.out.println("Invalid day " + day);
                return null; // String word = null --> word is not object, has no value
        }
    }
}
