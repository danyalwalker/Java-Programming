package OfficeHours.Practice.certification.lambda_practices;

import java.util.ArrayList;
import java.util.List;

/**
 * Predicate is a common interface.
 * It has one method named test that returns a boolean and takes any type.
 * The removeIf() method on ArrayList takes a Predicate.
 */
public class PredicatePractice {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.removeIf(num -> numList.get(0) > 1);
        System.out.println(numList);

    }
}
