package OfficeHours.Practice.certification;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] arr = {"5", "6", "7", "8", "9", "1", "250", "2", "3", "4", "10", "100"};
        Arrays.sort(arr);

        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        /**
         * Negative value showing one smaller than the negative of index, where a match needs to be inserted to preserve sorted order
         * The array has to be sorted in order to apply search method.
         */
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

        int[][] vars1; //2D array
        int vars2[][]; //2D array
        int[] vars3[];//2D array
        int[] vars4[], space[][]; // a 2D AND a 3D array

        String[][] rectangle = new String[3][2];

        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};

        int[][] args1 = new int[4][];
        args1[0] = new int[5];
        args1[1] = new int[3];

        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) System.out.print(twoD[i][j] + " "); // print element
            System.out.println(); // time for a new row }
        }

        for (int[] inner : twoD) { for (int num : inner)
            System.out.print(num + " "); System.out.println();
        }
    }

}
