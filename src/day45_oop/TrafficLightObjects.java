package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        // Create a traffic igh object
        TrafficLights trafficLight = new TrafficLights();
        //trafficLight.color = "red";
        // we will instead assign update the value of color using a method of the class
        trafficLight.changeColor("red");
        ///System.out.println("current color = " + trafficLight.color); DIRECT access to variable. Not recommended
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLights trafficLight2 = new TrafficLights();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();
    }
}
