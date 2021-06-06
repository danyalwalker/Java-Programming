package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int [] arr = new int[num+2];

        arr[0]=0;
        arr[1]=1;
       for( int i=0; i<num; i++){

            arr[i+2] = arr[i+1]+ arr[i];

        }
        System.out.print(arr[num]);


        }


    }

