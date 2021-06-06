package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "iphone";
        int model = 10;
        String color = "black";
        int storage = 256;
        boolean hasCamera = true;
        double price = 699.00;
        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(storage);
        System.out.println(hasCamera);
        System.out.println(price);
        // With message use concatenation
        System.out.println("Phone brand: "+ brand);
        System.out.println("Storage is " + storage + "gb");
        System.out.println( "Price is $" + price);
        System.out.println("Has Camera? " + hasCamera);





    }
}
