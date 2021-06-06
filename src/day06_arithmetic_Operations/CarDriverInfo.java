package day06_arithmetic_Operations;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel= "Audi Q7";
        String DriverName= "Daniel";
        String licensenumb = "DA1234234987";
        String insurancetype = "Geico";
        Short Speed = 140;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car model is " + carModel);
        System.out.println("Driver name is "+ DriverName);
        System.out.println("license number is "+ licensenumb);
        System.out.println("Insurance name is "+ insurancetype);
        System.out.println("Max speed is "+Speed);
        System.out.println("Is vehicle " + isAutomatic);
        System.out.println("License type: "+ licenseClass);

        System.out.println( carModel + " has maximum speed of "+ Speed + "mph");
        System.out.println ( DriverName + " is driving "+ carModel);
        //Review the one below, they are not String.
        System.out.println( licenseClass + "" + isAutomatic);
        // We had to put double quote in order to place a char type and boolean type together.



    }
}
