package day38_methods;

/**
 * How do you print 1 to 100 without a loop?
 * I can use recursive method where the method will call itself.
 * recursion takes more space compared to loop.
 */
public class RecursiveMethod {
    public static void printNum(int num){
        System.out.println(num);
        num--;
        if(num>0){
            printNum(num);
        }
    }
    public static void printHundred(int nums){
        System.out.print(nums + " ");
        nums++;
        if(nums<=100){
        printHundred(nums);}

    }

    public static void main(String[] args) {
printNum(5);
printHundred(1);

    }
}
