package OfficeHours.Practice_Replit.ArrayList;

/**
 * Arrays.asList(array) -> this is converting array to arraylist
 * -------------------------------------
 *
 * List<Integer> nums = Arrays.asList( 23, 1 ,34 , 54, 654);
 * System.out.println("nums = " + nums);
 * //nums.add(100); UnsupportedOperationException
 * //nums.remove(0);UnsupportedOperationException
 * //nums.clear();UnsupportedOperationException
 *
 * The reason for UnsupportedOperationException is
 * when we use Arrays.asList it will return immutable list, that size cannot be modified.
 * But we can do any other operations on it.
 *
 * WorkAround:
 * List<Integer> nums = new ArrayList(Arrays.asList( 23, 1 ,34 , 54));
 */
public class ConvertArrayToArrayList {
}
