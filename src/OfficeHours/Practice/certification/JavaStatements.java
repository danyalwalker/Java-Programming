package OfficeHours.Practice.certification;

public class JavaStatements {
    public static void main(String[] args) {
        boolean a = true;
        int x = 2, y = 3,z;
        
        if(a) z=x+y; else z=x-y;
        System.out.println("z = " + z);

        if(a) z=x+y;  z=x-y;
        System.out.println("z = " + z);

       z = a? x+y : x-y;
        System.out.println("z = " + z);

        System.out.println((y < 5) ? 21 : "Zebra"); // 21 is converted into String
        System.out.println((y < 5) ? 8 : 3); // 21 is converted into String
       //  String animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE since 9 cannot be assigned to String
       //  int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE since Horse cannot be assigned to int

         y = 1;
         z = 1;
         x = y<10 ? y++ : z++; System.out.println(y+","+z); // only one right hand expression is run

       y = 1;
       z = 1;
       x = y>=10 ? y++ : z++; System.out.println(y+","+z);  // only one right hand expression is run

         x = 2; y = 5; 
         while(x < 6)
            x++;
            y++;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = 2; y = 5;
        while(x < 6){
            x++;
            y++;}
        System.out.println("x = " + x);
        System.out.println("y = " + y);

         x = 0;
         do
            x++;
         while(false); //it will never execute
         System.out.println("x: " + x); //statement after while loop exited

        x=20;
        while(x > 10)
        { x--;
            System.out.print("x = " + x);}

        System.out.println();

        x=20;
         do {
            x--;
            System.out.print("x = " + x);
        } while(x > 10);

        int counter = 1;

        do {
            System.out.print(", counter = " + counter);
            counter++;
        } while(counter <= 10);
    }
    }

