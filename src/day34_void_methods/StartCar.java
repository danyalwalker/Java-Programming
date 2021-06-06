package day34_void_methods;

public class StartCar {


    public static void sitInCar() {
        System.out.println("Open the door and sit in the driver seat");

    }
    public static void pressGasPedal(){
        System.out.println("Hold the steering wheel, and press the gas pedal");
    }

    public static void main(String[] args) {
        sitInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }

    public static void startTheCar(){
        System.out.println("Hit the ignition button and start the car");
    }

    public static void shiftToDrive(){
        System.out.println("Push the break pedal and shift to drive");
    }

}