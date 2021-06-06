package day46_encapsulation;

public class dealership {
    public static void main(String[] args) {
        Car vehicle = new Car();
       // vehicle.model = "Audi Q5"; gives error due to private status of the variable
        vehicle.setModel("Audi Q5");
        System.out.println("vehicle = " + vehicle.getModel());
        
        vehicle.setYear(2020);
        System.out.println("Vehicle year = " + vehicle.getYear());

        vehicle.setMileage(43700);
        System.out.println("Vehicle mileage " + vehicle.getMileage());

        System.out.println("vehicle.toString() = " + vehicle.toString());
        System.out.println(vehicle); // automatically calls toString method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Giluia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(17354);

        System.out.println(alfaRomeo);
    }
}
