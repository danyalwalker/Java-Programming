package OfficeHours.Practice.certification;

public class InheritVehicle {
       int x;
       InheritVehicle(){
          this(10);  // line n1
       }
    InheritVehicle(int x) {
        this.x = x;
    }

       class Car extends InheritVehicle{
           int y;
           Car(){
               super(10); // line n2
           }
           Car(int y) {
               super(y);
               this.y = y;
           }
    }

    
}
