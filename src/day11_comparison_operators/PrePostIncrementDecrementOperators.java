package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        
        // PRE-INCREMENT
        int num1 = 1;
                num1++;
                ++num1;
        System.out.println("num1 = " + num1);; //3
        
        
        int num2 =5;
                num2--;
                --num2;
        System.out.println("num2 = " + num2);; // 3

        // PRE-INCREMENT
        int num3 = 4;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);; //5
        System.out.println("num4 = " + num4);; //5

        //POST-INCREMENT
        int num5 = 4;
        int num6 = num5++;
        System.out.println("num5 = " + num5);; //5
        System.out.println("num6 = " + num6);; //4
        
        
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 7;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars); //6 increase first then print left to right

        int sedans = 10;
        System.out.println(sedans++); //10 print sedans first then increase
        System.out.println(sedans); // 11

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber); //45
        ++myNumber;
        System.out.println(myNumber); //46

        myNumber = 20;
        System.out.println(++myNumber); //21

        myNumber = 33;
        System.out.println(myNumber++); //33
        System.out.println(myNumber); //34

        int hisNumber = 15;
        int yourNumber = ++myNumber;
        System.out.println("myNumber = " + myNumber);
        System.out.println("yourNumber = " + yourNumber);

        int herNumber = 99;
        System.out.println("herNumber = " + herNumber);
        int ourNumber = herNumber++;
        System.out.println("ourNumber = " + ourNumber);
        System.out.println("herNumber = " + herNumber);
        
        int a = 50;
        int b = 22;
        int c = a++ + ++b; // 50+23

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);



    }
}
