package day37_methos_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
        System.out.println(repeatString("hi", 5, '^'));
    }
    public static String repeatString(String word, int times, char delimiter){
          // return "java|java|java"
        //return "hi^hi^hi^hi^hi"
            String result = "";
        for (int i = 0; i <times ; i++) {
           result += word+delimiter;

        }
        return result;
    }
}
