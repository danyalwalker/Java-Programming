package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {

        String cats = "bengal cat tabby cat persian cat no cat here";
        //count how many cats in the string
        int count = 0;
        for (int i = 0; i < cats.length()-2; i++) {
           if(
            cats.substring(i,i+3).equals("cat")){
               count++;
           }


        }
        System.out.println(count);

        System.out.println(cats.split("cat").length-1);
    }
}
