package OfficeHours.Practice.certification.Arrays;

public class MDArrays {
    public static void main(String[] args) {
        int [][] arr = new int [][] {{1,2},{1,2}};

        int [][] arr1 = new int [2][];

        int numbers[];
        numbers = new int[2];
        numbers[0] = 10;

        int numbers2[];
        // numbers2[0] = 10; you can not assign unless you initialize the object array

    }
}

class MDArrays2{
    public static void main(String[] args) {
        int [][]arr = new int [2][4];
        arr[0]= new int[]{1,3,5,7};
        arr[1]= new int []{1,3};
        for(int[]a : arr){
            for (int i = 0; i < arr.length ; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
