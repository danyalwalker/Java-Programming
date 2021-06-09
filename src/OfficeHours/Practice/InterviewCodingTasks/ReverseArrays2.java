package OfficeHours.Practice.InterviewCodingTasks;

public class ReverseArrays2 {

    public void reverrArr2(int[] num){
        int [] revAr = new int[num.length];
        for (int i = 0, j = num.length-1; i < num.length; i++, j--) {
            revAr[i] = num[j];
        }
    }
}
