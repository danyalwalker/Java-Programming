package OfficeHours.Practice.certification;

public class concat {
    public static void main(String[] args) {
        String[] strs = {"A","B"};
        int idx = 0;
        for(String s: strs) {
            strs[idx].concat("element" + idx);
        }

        for (idx = 0; idx<strs.length; idx++) {
            System.out.println(strs[idx]);
        }

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println("s2 = " + s2);  // String is immutable
        System.out.println("s2.concat(\"3\") = " + s2.concat("3"));



    }
}
