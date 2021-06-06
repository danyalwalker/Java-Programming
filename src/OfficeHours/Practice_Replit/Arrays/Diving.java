package OfficeHours.Practice_Replit.Arrays;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //WRITE YOUR CODE HERE

        for (int i = 1; i < 8 ; i++) {
            System.out.println("Enter score for judge " + i + ":");
            score[i-1] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difnum = input.nextFloat();
        float lowest = 10;
        float highest = 0;
        float totalScore = 0;
        for (int i = 0; i < 7 ; i++) {
            if(score[i] < lowest ){
                lowest = score[i];
            }
            if(score[i] > highest ){
                highest = score[i];
            }
            totalScore+= score[i];
        }
        double diverScore = ((totalScore -highest -lowest) * difnum * 0.6);
        double roundOff = Math.round(diverScore * 100.0) / 100.0;
        System.out.println("Total: " + roundOff);
    }
}
