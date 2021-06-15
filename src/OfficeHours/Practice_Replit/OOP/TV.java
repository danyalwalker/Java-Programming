package OfficeHours.Practice_Replit.OOP;


public class TV {
    int channel=1;
    int volumeLevel=0;
    boolean on = false;
    String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no arg - constructor");
    }

    public TV(String brand){
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setVolumeLevel( int volumeLevel){
        if(volumeLevel < 0 || volumeLevel > 7 || !isOn()){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");

        }else{
            this.volumeLevel = volumeLevel;
        }
    }

    public  int getVolumeLevel(){
        return volumeLevel;
    }

    public void setChannel( int channel){

        if(channel < 0 || channel > 120 ){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        } else{
            this.channel = channel;
        }
    }
    public int getChannel(){
        return channel;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }

    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }

    public boolean isOn(){ return on; }

    public void turnOn(){
        if(on == true){
            System.out.println("TV is already ON");
        } else{ on = true;}

    }
    public void turnOff(){
        if(on = false) {System.out.println("TV is already OFF");
        } else {on = false;}
    }
}



