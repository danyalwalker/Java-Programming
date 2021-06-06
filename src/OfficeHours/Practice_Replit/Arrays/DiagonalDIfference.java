package OfficeHours.Practice_Replit.Arrays;
        import java.util.Scanner;
public class DiagonalDIfference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;

        int diagonal1 = 0;
        int diagonal2 = 0;


            for (int j = 2,i=0; i<3 ;i++, j--) {
                diagonal1 += matrix[i][j];
            }




            for (int j = 0,i=0; j < 3; i++,j++) {
                diagonal2 += matrix[i][j];

        }
        result = diagonal1 - diagonal2;
        System.out.println(Math.abs(result));
    }
}
