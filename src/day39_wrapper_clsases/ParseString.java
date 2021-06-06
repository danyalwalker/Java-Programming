package day39_wrapper_clsases;

public class ParseString {
    public static void main(String[] args) {
        /**
         IQ * How do you convert String into number?
         We can use parse or valueOf methods in wrapper classes.
         */
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);
        if(price>100){
            System.out.println("expensive");
        }
        
        String sentence = "I wrote 100 lines of code";
        String[] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println("linesOfCode = " + linesOfCode);
    }
}
