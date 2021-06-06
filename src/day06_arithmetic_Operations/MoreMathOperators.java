package day06_arithmetic_Operations;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyota = 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;

        int totalCarsInParking = toyota + honda + vw + tesla + nissan + bmw;
        System.out.println("There are " + totalCarsInParking + " cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println(slicesPerPerson);
        System.out.println("We ordered "+ pizza +" pizza with "+ slices+ " slices, "+ people+ " people ate "+ slicesPerPerson+ " slices each." );




    }
}
