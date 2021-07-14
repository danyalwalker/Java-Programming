package OfficeHours.Practice.InterviewCodingTasks;

public class NumberPalindrome {
    public static int numberPalindrome(int num){
        String reverse = "";
        boolean isPalindrome = false;

        while (num>0){

            reverse += num % 10 + "";
            num = num / 10;
        }
        return Integer.parseInt(reverse);
    }

    public static void main(String[] args) {
        System.out.println(numberPalindrome(1576));
    }
}
