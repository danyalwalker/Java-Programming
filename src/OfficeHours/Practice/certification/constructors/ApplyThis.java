package OfficeHours.Practice.certification.constructors;

public class ApplyThis {
    private String color;
    private int height;
    private int length;
    public ApplyThis(int length, int theHeight){
        length = this.length;  // backwards - no good. this should apply to class instance instead.
        height = theHeight;  // fine since a different name
        this.color = "white"; // fine, but redundant
    }

    public static void main(String[] args) {
         ApplyThis b = new ApplyThis(1,2);
         System.out.println(b.length + " " + b.height + " " + b.color);  }
}
