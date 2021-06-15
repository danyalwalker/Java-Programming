package OfficeHours.Practice_Replit.OOP;

public class GasTank {
    double amount =0;
    double capacity;

    public GasTank(double capacity){
        this.capacity = capacity;
    }
    public void addGas(double num){
        amount +=num;
        if(amount>capacity){
            amount = capacity;
        }
    }
    public void useGas(double num2){
        amount -= num2;
        if(amount<0){
            amount = 0;
        }
    }

    public boolean isEmpty(){
        boolean result = false;
        if(amount<0.1){
            result = true;
        }
        return result;
    }

    public boolean isFull(){
        boolean result = false;
        if(amount>(capacity-0.1)){
            result = true;
        }

        return result;
    }

    public double getGasLevel(){
        return amount;
    }

    public double fillUp(){
        amount = capacity;
        double fillUpAmount = capacity - amount;
        return fillUpAmount;
    }




}
