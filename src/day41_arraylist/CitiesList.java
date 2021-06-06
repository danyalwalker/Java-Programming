package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add cities to arraylist
        cities.add("Washington DC");
        cities.add("Putnam");
        cities.add("Adana");
        cities.add("Staten Island");
        // add Asgabat to 0 index
        cities.add(0,"Ashgabat");
        cities.remove("Brooklyn");
        System.out.println(cities);
        //print first and last cities
        System.out.println("first city " + cities.get(0));
        System.out.println("last city " + cities.get(cities.size()-1));
        System.out.println("count of items =" + cities.size());

        for (int i = 0; i < cities.size() ; i++) {
            System.out.print(cities.get(i) + " ");

        }
        System.out.println();
        for(String each:cities){
            System.out.print(each + " ");
        }

        // delete items from list
        // using index
        cities.remove(3);
        // 2. using object/value
        cities.remove("Staten Island");
        System.out.println(cities);

        //delete all values from arraylist
        cities.clear();
        System.out.println(cities);


        // isEmpty boolean
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }

        // check size() = 0
        if( cities.size() == 0){
            System.out.println("list is empty");
        }
    }
}
