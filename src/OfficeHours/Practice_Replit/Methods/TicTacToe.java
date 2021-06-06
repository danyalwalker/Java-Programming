package OfficeHours.Practice_Replit.Methods;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }

    public static String won(char[] x){

        String result = "";

        if(        (x[0]=='x' && x[1]=='x' && x[2]=='x')
                || (x[0]=='x' && x[3]=='x' && x[6]=='x')
                || (x[0]=='x' && x[4]=='x' && x[8]=='x')
                || (x[1]=='x' && x[4]=='x' && x[7]=='x')
                || (x[2]=='x' && x[5]=='x' && x[8]=='x')
                || (x[2]=='x' && x[4]=='x' && x[6]=='x')
                || (x[6]=='x' && x[7]=='x' && x[8]=='x')
                || (x[3]=='x' && x[4]=='x' && x[5]=='x')
        ) {
            result = "Player X won";
        } else if(
                           (x[0]=='o' && x[1]=='o' && x[2]=='o')
                        || (x[0]=='o' && x[3]=='o' && x[6]=='o')
                        || (x[0]=='o' && x[4]=='o' && x[8]=='o')
                        || (x[1]=='o' && x[4]=='o' && x[7]=='o')
                        || (x[2]=='o' && x[5]=='o' && x[8]=='o')
                        || (x[2]=='o' && x[4]=='o' && x[6]=='o')
                        || (x[6]=='o' && x[7]=='o' && x[8]=='o')
                        || (x[3]=='o' && x[4]=='o' && x[5]=='o')
        ){
            result = "Player O won";
        }
        return result;
    }

}
