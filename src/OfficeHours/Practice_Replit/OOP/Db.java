package OfficeHours.Practice_Replit.OOP;

public class Db {
    private String data;
    private int yint;

    // Do not touch
    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }
    // Do not touch

    public String getData(){
        return data;

    }
    public int getYint(){
        return yint;

    }
    public void setData(String data){
        this.data = data;
    }
    public void setYint(int yint){
        this.yint = yint;
    }
}
