package day15_logicalops_switch_ternary;
/*
When grade is A,B or C passed
when grade is D, qualify for retake
when grade is F, fail
anything else, invalid grade
 */
public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if ( grade == 'A' || grade =='B' || grade == 'C'){
            System.out.println("Passed with grade " + grade);
        } else if ( grade == 'D'){
            System.out.println("Qualify fo retake ");
        } else if ( grade == 'F'){
            System.out.println("Failed with grade "+ grade);
        } else {
            System.out.println("Invalid Grade");
        }
            grade = 'd';
        if ( grade == 'A' || grade == 'a' || grade =='B' || grade == 'C'|| grade == 'c'){
            System.out.println("Passed with grade " + grade);
        } else if ( grade == 'D'|| grade == 'd'){
            System.out.println("Qualify fo retake ");
        } else if ( grade == 'F'){
            System.out.println("Failed with grade "+ grade);
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
