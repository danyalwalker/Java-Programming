package day25_loops;
import java.util.Scanner;
public class StartEndwithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start,end;
        start = scan.nextInt();
        end = scan.nextInt();
        if(start > end){
            System.out.println("reverse numbering is not supported");
        }
        for (int i = start; i <= end ; i++) {
            System.out.print(i + " ");

        }
    }
}
