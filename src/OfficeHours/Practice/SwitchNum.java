package OfficeHours.Practice;

public class SwitchNum {
    public static void main(String[] args) {
        int num = 2;
        boolean b = true;

        switch(num){
            case 0:
                b = false;
            case 1:
                System.out.print(1);
            case 2:
                if(b) {
                    System.out.print(2);
                } else {
                    b = false;
                }
            case 3:
                if(b){
                    System.out.print(3);
                    b = false;
                } else{
                    break;
                }
            case 4:
                System.out.print(4);
            case 5:
                if(!b) {
                    break;
                }
                System.out.print(5);
        }
    }
}
