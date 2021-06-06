package day19_class_vs_object_strings;

public class StartsEndsWithMethod {
    public static void main(String[] args) {
        String word = "selenium";
        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("selen"));
        System.out.println("___________________");

        word = "java";
        System.out.println(word.startsWith("ja"));
        System.out.println(word.startsWith("va"));
        System.out.println(word.startsWith("JA"));
        System.out.println(word.startsWith(" ja"));
        System.out.println("________________________");

        word = "selenium";
        System.out.println(word.endsWith("m"));
        System.out.println(word.endsWith("ium"));
        System.out.println(word.endsWith("se"));
        System.out.println("_______________________");

        word = "java";
        System.out.println(word.endsWith("ja"));
        System.out.println(word.endsWith("va"));
        System.out.println(word.endsWith(" va"));
        System.out.println(word.endsWith("Va"));
        System.out.println("java".endsWith("a"));
        System.out.println("____________________");

        String name = "Mr. Alcan";
        if (name.startsWith("Mr.")){
            System.out.println("Man");
        } else if (name.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (name.startsWith("Mrs.")){
            System.out.println("Married Woman");
        }else if (name.startsWith("Ms.")){
            System.out.println("Single Women");
        }else if (name.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("We are all human");
        }

        String url = "https://hello.com";
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        }else if(url.endsWith(".ru")){
            System.out.println("russian website");
        }else if(url.endsWith(".gov")){
            System.out.println("government website");
        }else if(url.endsWith(".edu")){
            System.out.println("education website");
        }else if(url.endsWith(".org")) {
            System.out.println("organization website");
        }
    }
}
