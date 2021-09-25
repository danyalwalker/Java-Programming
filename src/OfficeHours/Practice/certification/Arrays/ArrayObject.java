package OfficeHours.Practice.certification.Arrays;

public class ArrayObject {
    String name;

    @Override
    public String toString() {
        return "ArrayObject{" +
                "name='" + name + '\'' +
                '}';
    }

    public ArrayObject(String name){
        this.name = name;


    }
}

class Test{
    public static void main(String[] args) {
        String a = null;
        System.out.println(a);
        ArrayObject[] arr = new ArrayObject[3];
        arr[1] = new ArrayObject("1");
        arr[2] = new ArrayObject("2");
        for (ArrayObject each : arr) {
            System.out.println(each);
        }
        System.out.println(args.length);
        System.out.println(args);
        for (ArrayObject each : arr) {
            System.out.println(each.name);
        }

    }
}
