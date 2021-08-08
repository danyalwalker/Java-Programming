package OfficeHours.Practice.certification;

public class StrBuilder {

    public static void main(String[] args) {
//        String alpha = "";
//         for(char current = 'a'; current <= 'z'; current++)
//            alpha += current;
//            System.out.println(alpha);  Each time a new String object is created and left for garbage collection


        StringBuilder alpha = new StringBuilder(); // StringBuilder is not immutable
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);  // This method creates a String without creating interim Strings each time.
        System.out.println(alpha);

        System.out.println();

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        System.out.println(sb.equals(same));

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(a.equals(b));

        System.out.println();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true

         sb = new StringBuilder("animals");
         sb.insert(7, "-");
         sb.insert(0, "-");
         sb.insert(4, "-");
         System.out.println(sb);

    }
}
