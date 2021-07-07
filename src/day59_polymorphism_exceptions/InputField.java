package day59_polymorphism_exceptions;

public class InputField implements WebElement{
public static final String TAG_NAME = "input";
    public String getValue() {
        System.out.println("Getting value in the InputField");
        return "selenium";
    }
    @Override
    public void sendKeys(String txt) {

    }

    @Override
    public void click() {

    }

    @Override
    public String getText() {
        return null;
    }
}
