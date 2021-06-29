package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    //Marker interface -> without any methods or variables. We can use this for polymorphism or to mark the class as capable fo whatever interface claims
}
