package OfficeHours.Practice_Replit.OOP;

public class TV2 {
    int channel = 1;
    int volumeLevel = 0;
    boolean on = false;
    String brand = "undefined";

    public TV2() {
        System.out.println("Creating TV object using no args-constructor");
    }

    public TV2(String brand) {
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel>0 && volumeLevel<7 && isOn())
            this.volumeLevel = volumeLevel;
        else System.out.println("ERROR: TV is either OFF or invalid Volume level");
    }

    public void setChannel(int channel) {
        if(channel>0 && channel<120 &&isOn())
            this.channel = channel;
        else System.out.println("ERROR: TV is either OFF or invalid Channel");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public int getChannel() {
        return channel;
    }

    public String getBrand() {
        return brand;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    public void turnOn() {
        if (on) {
            System.out.println("TV is already ON");
        } else {
            on = true;
        }

    }

    public void turnOff() {
        if (!on) {
            System.out.println("TV is already OFF");
        } else {
            on = false;
        }
    }

    public boolean isOn() {
        return on;
    }
}
