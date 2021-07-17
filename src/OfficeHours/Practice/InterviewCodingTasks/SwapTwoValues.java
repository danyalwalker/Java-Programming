package OfficeHours.Practice.InterviewCodingTasks;

public class SwapTwoValues {
    public static void main(String[] args) {
        int j = 15;
        int i = 10;

        j= j - i;
        i = i + j;
        j = i - j;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}
