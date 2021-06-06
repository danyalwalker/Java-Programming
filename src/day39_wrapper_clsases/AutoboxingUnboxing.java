package day39_wrapper_clsases;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // Wrapper classes are to convert primitive to object type
        // What is the difference between Auto-boxing and un-boxing?
        // Autoboxing is to convert from primitive to wrapper class.
        //unboxing is to convert from wrapper class to primitive

        int num = 50;
        Integer num2 = num;
        Integer num3 = 123;
        // nu1 is primitive, nu2 is Wrapper class object. We did Auto Boxing.

        Integer n = new Integer(234);
        int n2 = n;
        // Unboxing is converting Wrapper class object into primitive.
        /**
         * Why Wrapper classes?
         * 1) Useful methods comes with wrapper classes.
         * 2) Most of Collections use objects, an can not use primitives, so we can use wrapper classes with them.
         *
         * Ex: ArrayList can not hold primitive, it needs an object so we can use wrapper class
         */
        Double d1 = 105.23;
        double d2 = d1; // unboxing
        double d3 = new Double(345.1);

        char letter = 'k';
        Character letter2 = letter; //AutoBoxing
    }
}
