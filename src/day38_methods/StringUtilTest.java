package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullorEmpty(userName)){
            System.out.println("Fail: Username can not be null or empty");
        }
        System.out.println("isPalindrome(\"civic\") = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(\"cybertek\") = " + StringUtils.isPalindrome("cybertek"));
        System.out.println("isPalindrome(\"kayak\") = " + isPalindrome("kayak")); // because I imported the methods from StringUtils class, no need to mention class anymore
        System.out.println("reverse(\"hello\") = " + reverse("hello"));
        String word = "saturday";
        String revWord= StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
    }
}
