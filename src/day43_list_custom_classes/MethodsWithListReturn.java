package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    /**
     * getIntegerList
     * No Params
     * return List</Integer>
     * Loop from 0 - 1000_000
     *
     */
    public static List<Integer> getIntegerList(){
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<1000_000;i++){
           list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {

        // 1_000_000_000 of a second
        long start = System.nanoTime();
        List<Integer>mlnList = getIntegerList(); // returns ready ArrayList object. No need to new ArrayLIst<>();
        long end = System.nanoTime();
        System.out.println("ArrayList time = " + (end - start));

        long st = System.nanoTime();
       int [] arr = getIntegerArray();
        long en = System.nanoTime();
        System.out.println("Array time = " + (en - st));
    }

    /**
     *  * getIntegerArray
     *      * No Params
     *      * return List</Integer>
     *      * Loop from 0 - 1000_000
     *      *
     *
     */
    public static int [] getIntegerArray(){
        int [] nums = new int[1000_001];
        for (int i = 0; i < 1000_000 ; i++) {
            nums[i] = i;
        }
        return nums;
    }


}

