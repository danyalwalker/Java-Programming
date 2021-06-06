package OfficeHours.Practice.LoopsPractice;

public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";
        String sub = "";
        String longest = "";


        for (int i = 0; i < str.length(); i++) {
            for (int f = i; f < str.length(); f++) {
                if (str.charAt(i) == str.charAt(f)) {
                    sub += str.charAt(f);
                }else{
                    i = f-1;
                    break;
                }
            }

            if (sub.length() > longest.length())
                longest = sub;

            sub = "";
        }
        System.out.println("Biggest substring: " + longest);
    }
}



