package OfficeHours.Practice_Replit;
import java.util.Scanner;
public class LaptopNested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select screen size:");
        System.out.println("Select CPU type:" );
        System.out.println("Select RAM size:");
        System.out.println("Select storage type:");
        System.out.println("Select storage size:");
        System.out.println("Select screen resolution:");

        double screenSize = in.nextDouble();
        double price = 0;
        String cpuType = in.next();
        byte ramSize = in.nextByte();
        String storageType = in.next();
        int storageSize = in.nextInt();
        String screenRes = in.next();

        if(screenSize == 13.3){
            price += 200;
        } else if ( screenSize == 15.0){
            price += 300;
        } else if ( screenSize == 17.3){
            price += 400;

        }

          if ( cpuType.equals("i3") ){
            price += 150;
        } else if ( cpuType.equals("i5")){
            price += 250;
        } else if (cpuType.equals("i7" )){
            price += 350;

        }

        if(ramSize == 4 ){
            price += 50;
        } else if ( ramSize == 8){
            price += 100;
        } else if (ramSize == 16){
            price += 200;
        }
        System.out.println("Laptop price is: " + price);

        if (storageType.equals("SSD")){
            if(storageSize == 500){
                price += 100;} else
            if(storageSize == 1000){price += 200;}
        } else if (storageType.equals("HDD")){
            if(storageSize == 500){
                price += 50;} else
            if(storageSize == 1000){price += 10;}
        }


        if (screenRes.equals("FULLHD") ){
            price += 100;
        } else if(screenRes.equals("4K")){
            price += 200;
        }
        System.out.println("Laptop price is: " + price);










    }
}
