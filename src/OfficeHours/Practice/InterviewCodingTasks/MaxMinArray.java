package OfficeHours.Practice.InterviewCodingTasks;

public class MaxMinArray {
    public static int maxNum(int[] arr1) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        return max;
    }

    public static int minNum(int[] arr1) {
        int min = arr1[0];
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxNum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(minNum(new int[]{1, 2, 3, 4, 5}));
    }
}
