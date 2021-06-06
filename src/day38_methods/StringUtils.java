package day38_methods;
// Liobrary in java : someone else's project that you can add to your project to use.
public class StringUtils {

    public static String reverse(String word){
        String rev ="";
        for (int i = word.length()-1; i>=0 ; i--) {
            rev += word.charAt(i);
        }
        return rev;

    }

    public static boolean isNullorEmpty(String str){
       if(str == null || str.isEmpty()){
           return true;
       }
         return false;
    }

    public static void main(String[] args) {
        System.out.println("isNullorEmpty(\"hello\") = " + isNullorEmpty("hello"));
        String word = null;
       // System.out.println(word.toUpperCase()); Nullpointerwxception because we are trying to run a string method on no string/null.
        System.out.println("isNullorEmpty(word) = " + isNullorEmpty(word));
        word = "";
        System.out.println("isNullorEmpty(word) = " + isNullorEmpty(word));


    }
/**
 * - if (str.isEmpty || word == null ){ → this will give NullPointerException
 * - if(word == null || word.isEmpty()) { → this will be true, NO ERROR
 * - if(word == null | word.isEmpty()) { → this will give NullPointerException because you are using one pipe which forces the program to check both sides
 */



public static boolean isPalindrome(String str){

    for (int i = 0; i < str.length()/2 ; i++) {
       if (str.charAt(i)== str.charAt(str.length()-1-i)){
           return true;
       }
    }
    return false;

}

}

