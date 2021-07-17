package day61_exceptions;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        ElementaryStudent el1 = null;
        try {
            el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); // print the error track race and continue. does not stop code
        }


        System.out.println("----Execution Completed ---");
    }
}
