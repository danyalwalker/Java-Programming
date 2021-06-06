package day19_class_vs_object_strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("wooden spoon".length()); // adds the space to count since space is character
        int count = "wooden spoon".length();
        System.out.println("count = " + count);

        String password = "abc123";
        if (password.length()>6){
            System.out.println("Valid Amazon Password");
        } else {
            System.out.println("Please enter at least 6 characters");
        }



        }
    }

