package OfficeHours.Practice.certification;

public class ForLoop {
    public static void main(String[] args) {
//        for( ; ; ) {
//            System.out.println("Hello World"); }
//     INFINITE LOOP
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.print(x);
        System.out.println();

        int k = 0;
        long y =10;
        for(y = 0, k = 4; k < 5 && y < 10; k++, y++) {
            System.out.print(x + " "); }
        System.out.println();

//        int x = 0;
//        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(x + " "); }
// DOES NOT COMPILE

        String[] names = new String[3];
        for (String name : names) {
            System.out.println("name = " + name);
        }

        x = 20;
        while(x>0) {
            do {
                x -= 2;
            } while (x>5);
            x--;
            System.out.print(x+"\t");
        }


    }



}
