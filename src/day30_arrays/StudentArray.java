package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "2071";
        student1[1] = "Daniel";
        student1[2] = "Walker";
        student1[3] = "22";
        student1[4] = "9172007802";

        String[] student2 ={"2071", "Daniel", "Walker", "22","9172007802" };
        System.out.println("student id = "+student2[0]);
        System.out.println("student1 firstName = "+ student2[1]);
        System.out.println("student1 lastName = "+student2[2]);
        System.out.println("student1 batch Num = "+student2[3]);
        System.out.println("student1 mobile num = "+student2[4]);

        System.out.println("student data length: " + student2.length);

        if (student1.length == student2.length){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
    }
}
