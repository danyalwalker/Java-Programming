package OfficeHours.Practice.InterviewCodingTasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> theList = Arrays.asList("a", "B", "d", "c");
        Collections.sort(theList);
        String[] array = theList.toArray(new String[4]);
        for (String string : array) System.out.print(string);
    }
}
