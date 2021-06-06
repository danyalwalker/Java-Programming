package day32_arrays_split;
/*
1.find and print details of most expensive item
2.find and print details of least expensive item
 */
public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,    150.0,   9.99,     250.0 ,   439.50,   39.99};
        int[] itemIDs =   {12345 ,   12346,   12347,    12348,    12349,    12350};


        double priceMax = prices[0];
        int indexOfMaxPrice = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] > priceMax){
                  priceMax = prices[i];
                indexOfMaxPrice = i;
            }

        }
        System.out.println(priceMax);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);


        int indexOfMinPrice = 0;
        double priceMin = prices[0];
        for (int i = 0; i < prices.length-1; i++) {
            if(priceMin > prices[i]){
                priceMin = prices[i];
                indexOfMinPrice = i;
            }


        }
        System.out.println(priceMin);
        System.out.println(items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - #" + itemIDs[indexOfMinPrice]);




    }
}
