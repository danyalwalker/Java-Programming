package day54_abstraction;

public class OnlineStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("Online student is attending class using zoom");
    }

//    public abstract void askQuestion(); -> error , abstract methods can only be in abstract classes
}
