package day29_NestedLoops;

public class MinuteSecondLoop {
    public static void main(String[] args) {


    /*
    Minute 1:
    1,2,3,4,5,6,7,8,9...59,60
    minute 2:
    1,2,3,4,5,6,7,8,9...59,60
    minute 3:
     */

        for (int minutes = 1; minutes <= 10; minutes++) {
            System.out.print("\nminutes " + minutes + "= ");
            for (int seconds = 1; seconds <= 60; seconds++) {
                System.out.print(seconds + " ");
            }
        }
        for (int minutes = 0; minutes <= 4; minutes++) {

            for (int seconds = 1; seconds < 60; seconds++) {
                System.out.print("\n" + minutes + ":" + seconds + " ");
            }
        }
    }
}