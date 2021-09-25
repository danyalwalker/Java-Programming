package OfficeHours.Practice.certification.Arrays;

public class BooleanArray {
    public static void main(String[] args) {
        Boolean [] bool = new Boolean[3];

        bool[0] = Boolean.valueOf(Boolean.parseBoolean("true"));

        bool[1] = Boolean.valueOf("hello");

        bool[2] = Boolean.valueOf(null);

        System.out.println(bool[0] + " " + bool[1] + " " + bool[2]);

        //System.out.println(Integer.valueOf(null)); Number Format exception
        System.out.println(Boolean.valueOf(null));
    }
}
