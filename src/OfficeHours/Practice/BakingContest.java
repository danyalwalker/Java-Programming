package OfficeHours.Practice;
import java.util.Scanner;
/*
[Baking contest]

You are in a baking contest. Your cookies will be rated by 3 judges. The 3 scores from the judges will be averaged and compared with the 2 other people in the contest.

Use variables: judge score 1, judge score 2, judge score 3, other person score 1, other persons score 2

If your score is more than both of the other people then print "First place!"
If your score is more then one other person then print "Second place"
If your score is less than both of the other people then print "Third place"
 */
public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Judge Scores");

    int judgescore1= scan.nextInt();
    int judgescore2= scan.nextInt();
    int judgescore3= scan.nextInt();
        int judgescore4= scan.nextInt();
        int judgescore5= scan.nextInt();
        int judgescore6= scan.nextInt();
        int judgescore7= scan.nextInt();
        int judgescore8= scan.nextInt();
        int judgescore9= scan.nextInt();

    double scoreMine = (judgescore1 + judgescore2 + judgescore3)/3;
    double contestant1 = (judgescore4 + judgescore5 + judgescore6)/3;
    double contestant2 = (judgescore7 + judgescore8 + judgescore9)/3;

    if (scoreMine>contestant1 && scoreMine>contestant2){
        System.out.println("First Place");
    } else if (scoreMine>contestant1 && scoreMine<contestant2 ){
        System.out.println("Second Place");
    } else if ( scoreMine<contestant1 && scoreMine<contestant2){
        System.out.println("Third Place");
    }


        }
    }

