package day34_void_methods;

public class CallFirstMethod {
    public static void main(String[] args) {
        // classname.methodName
        FirstMethod.displayYourMessage();
        // When you debug it will bring you to the source

        for (int i = 0; i < 10; i++) {
            FirstMethod.displayYourMessage();
        }
    }
}
