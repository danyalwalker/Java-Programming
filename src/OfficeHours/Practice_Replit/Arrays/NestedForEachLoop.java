package OfficeHours.Practice_Replit.Arrays;

public class NestedForEachLoop {
    public static void main(String[] args) {
        int rows [] = {1,2,3,4};
        int [] cols = {1,2,3};

        for(int row : rows){
            for (int col : cols){
                System.out.println("|Row" + row + "-Column" + col);
            }
            System.out.println();
        }
    }
}
