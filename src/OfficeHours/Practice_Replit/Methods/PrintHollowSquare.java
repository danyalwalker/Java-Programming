package OfficeHours.Practice_Replit.Methods;

public class PrintHollowSquare {
    public static void printHollow() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==0 || i==0 || i==4 || j==4)
                { System.out.print("*");}
                else
                { System.out.print(" ");}

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printHollow();
    }
}
