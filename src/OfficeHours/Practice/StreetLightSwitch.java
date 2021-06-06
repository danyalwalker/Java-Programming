package OfficeHours.Practice;
/*
[Street light]

You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"

 */
public class StreetLightSwitch {
    public static void main(String[] args) {
        String light = "green";
        switch(light){
            case "green":
                System.out.println("Go");
            case "yellow":
                System.out.println("Slow down");
            case "red":
                System.out.println("stop");
        }

    }
}
