package OfficeHours.Practice.abstraction;

public class ABCDTest {


    public static void main(String[] args) {
        int num = 3;
        ConcreteD objectD = new ConcreteD("Franfurt",num);
        objectD.come();
        objectD.jump();
        objectD.lay();
        objectD.slide();
        objectD.brake();
    }

}
