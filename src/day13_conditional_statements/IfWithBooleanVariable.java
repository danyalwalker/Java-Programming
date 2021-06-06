package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = !false;
     //   if (isHungry == true){
        if (isHungry){
            System.out.println("I am hungry,I will go get something to eat.");

        } else {
            System.out.println("I am not hungry, I will code java.");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it. lets buy");
        } else {
            System.out.println("Too expensive,lets keep coding java");
        }

        boolean isRemoteJob = true;
        // if it is not remote job print " Sorry, not interested"
        // otherwise, print " Sure, I am interested, what is the interview process?'

        if(isRemoteJob!= true){    // you can also write if(!isRemoteJob) or if(isRemoteJob == false)
            System.out.println("Sorry, not interested");
        } else{
            System.out.println("Sure, I am interested, what is the interview process");
        }

        int num = 9;
       if (num++ == 10){
           System.out.println("A");
       } else {
           System.out.println("B" + num);
       }

    }
}
