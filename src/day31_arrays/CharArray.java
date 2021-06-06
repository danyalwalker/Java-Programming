package day31_arrays;
        /*
      char array with following values:
       'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
       */
public class CharArray {
    public static void main(String[] args) {
        
        char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};
            // print each letter using  a loop
        for( char letter : letters){
            System.out.print( letter + " ");


        } // COONVERT CHAR ARRAY INTO STRING
        // when we have char array, we can create a string out of it.
        String sentence = new String(letters);
        System.out.println("\nsentence = " + sentence);

        // CONVERT STRING INTO CHAR ARRAY
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray length: " + itemArray.length);
        System.out.println("item length: " + item.length());
        System.out.println(itemArray);

        // Any string that we write in java, is a char array internally

        String[] fruits = { "bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each + "-");
            fruitStr += each + "-";

        }
        System.out.println("\nfruit string: " + fruitStr);

        String[] languages = { "java", "phyton", "c++","sql","ruby","javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("<>", languages));
        String added = String.join("|", languages);
        System.out.println("added = " + added);
    }
}
