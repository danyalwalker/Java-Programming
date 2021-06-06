package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class ArrayAdd {

    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.
        int [] newArr = new int[r.length +1];
        for(int i=0 ; i < newArr.length-1; i++){
            newArr[i]=r[i];
        }

        newArr[newArr.length-1] = n;
        System.out.print(Arrays.toString(newArr));

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }
}
