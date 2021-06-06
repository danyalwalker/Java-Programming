package OfficeHours.Practice_Replit;
import java.util.Scanner;
public class Blackjack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        if ((player + house)>21){ System.out.println("player bust");} else if(house>player){
            System.out.println("player loss");
        } else if (player == house){
            System.out.println("its a tie");
        } else if (player>house){
            System.out.println("player win");}

    }
}
