package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if ( floorNum == 1){
            System.out.println("Floor 1 is selected. Companies: Lobby,Verizon, Sarbucks");
        } else if (floorNum == 2){
            System.out.println("Floor 2 is selected. Companies: LCybertek, NASA, Intelsat");
        } else if (floorNum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else{
            System.out.println("Invalid Floor " + floorNum);
        }


        System.out.println(" **********switch statement version **********");

        floorNum = 2;
                switch(floorNum){
                    case 1: // As if (floorNum == 1){}
                        System.out.println("Floor 1 is selected. Companies: Lobby,Verizon, Sarbucks");
                        break; //Exit Switch
                    case 2:
                        System.out.println("Floor 2 is selected. Companies: LCybertek, NASA, Intelsat");
                        break;
                    case 3:
                        System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                        break;
                    default:
                        System.out.println("Invalid Floor - " + floorNum);
                        break; // This one is optional
                }
    }
}
