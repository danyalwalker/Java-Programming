package OfficeHours.Practice.certification.Arrays;

import java.util.Arrays;
class MyString{
    String msg;
    public MyString(String str){
        msg = str;
    }

    @Override
    public String toString() {
        return ""+ msg ;
    }
}
public class EmptyArray {
    public static void main(String[] args) {
        String[] strs = new String[3];
        int idx =0;
        for(String s : strs){
            strs[idx].concat("element " +idx);
            idx++;
        }

        System.out.println(Arrays.toString(strs));
        System.out.println(new MyString("hello"));
    }
}
