package OfficeHours.Practice.certification;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        //After java 5
        ArrayList<String> list4 = new ArrayList<String>();

        //After Java 7
        ArrayList<String> list5 = new ArrayList<>();

        //List is an interface
        List<String> list6 = new ArrayList<>();
        //ArrayList<String> list7 = new List<>(); // DOES NOT COMPILE

        ArrayList list = new ArrayList();
        list.add("hawk"); // [hawk]
        list.add(Boolean.TRUE); // [hawk, true]
        System.out.println(list); // [hawk, true]

        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
       // safer.add(Boolean.TRUE); // DOES NOT COMPILE

        List<String> birds = new ArrayList<>();
         birds.add("hawk");
         birds.add(1, "robin");
         birds.add(0, "blue jay");
         birds.add(1, "cardinal");
         System.out.println(birds);

        birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
         birds.add("hawk"); // [hawk, hawk]
         System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
         System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds); // []
       // birds.remove(100); IndexOutOfBoundsException

         birds = new ArrayList<>();
         birds.add("hawk");
         System.out.println(birds.size());
         birds.set(0, "robin");
         System.out.println(birds.size());
        // birds.set(1, "robin"); // IndexOutOfBoundsException

        birds.clear();
        System.out.println(birds.isEmpty()); //true
        System.out.println(birds.size());
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2
        birds.clear();
        System.out.println(birds.isEmpty());//true

        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk")); // true
        System.out.println(birds.contains("robin")); // false

        List<String> one = new ArrayList<>();
         List<String> two = new ArrayList<>();
         System.out.println(one.equals(two));
         one.add("a");
         System.out.println(one.equals(two));
         two.add("a");
         System.out.println(one.equals(two));
         one.add("b");
         two.add(0, "b"); // [b,a]
        System.out.println(one.equals(two)); // false


        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
