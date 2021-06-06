package day37_methos_overloading;

public class DaySelector2 {
    public static void main(String[] args) {
        System.out.println(getDayName2(3));
    }
    public static String getDayName2(int day){
        String dayname;
        switch(day){
            case 1:
                dayname= "Monday";
                break;
            case 2:
                dayname="Tuesday";
                break;
            case 3:
                dayname="Wednesday";
                break;
            case 4:
                dayname="Thursday";
                break;
            case 5:
                dayname= "Friday";
                break;
            case 6 :
                dayname="Saturday";
                break;
            case 7 :
                dayname="Sunday";
                break;
            default:
                System.out.println("Invalid day " + day);
                dayname= null;
        }
        return dayname;
    }
}
