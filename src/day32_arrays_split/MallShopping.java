package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        // index =          0         1         2           3       4           5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,   9.99,     250.0 ,   439.50,   39.99};
        int[] itemIDs =   {12345 ,   12346,   12347,    12348,    12349,    12350};

        // sample practice -> Shuffle the values in array using random class

        System.out.println("------FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY -----");
        // use for loop with condition

        for(int i = 0; i< items.length; i++) {
            if(items[i].equals("Gloves")){
                System.out.println("Gloves found at index " + i);
                break;
            }
        }

        System.out.println("-------Set boolean to true if first 'iPad' is found-------");
        boolean iPadExists = false;

        for (int i = 0; i<items.length; i++) {
            if(items[i].equalsIgnoreCase("iPad")){
                iPadExists = true;
                break;
            }
        }
        System.out.println(iPadExists);

        for (String item : items) {
            if(item.equalsIgnoreCase("iPad")){
                iPadExists = true;
                break;
            }
        }
        System.out.println(!iPadExists);

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
        }
        System.out.println("------Look for jacket in items and print all details");

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Jacket")){
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }

        }
    }
}
