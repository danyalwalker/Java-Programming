package day28_loopsContinued;

public class BreakVsContinue {
    public static void main(String[] args) {
        // Break Statement
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i);
            if(i == 3) {
                break;
            }
        }
        for (int i = 0; i <=5 ; i++) {
            if(i == 2 || i==4) {
                continue; //go to next iteration, skip the code below
            }
            System.out.print(i);
        }
    }
}
