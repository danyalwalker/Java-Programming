package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int[] data = {32, 534, 23, 5433, 45, 4566, 657, 123, 2, 324};

        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        for (int n : data) {
            System.out.println(n + " ");
        }

        int[] data2 = {32, 534, 23, 5433, 45, 4566, 657, 123, 2, 324};
        for (int i = 0; i < data2.length; i++) {
            System.out.println(data2[i]);
        }
        // print last value in array using (length - 1)

        System.out.println(data2[data2.length - 1]);

        // print all numbers backwards in same line
        for( int idx = data.length -1; idx > 0; idx--){
            System.out.println(data[idx]+" ");
        }
    }
}
