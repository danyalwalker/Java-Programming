package day35_methodParam;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
        displayUSaFlag();

    }
   // printAtoZ method prints all English Alphabet from A to Z.
    public static void printAtoZ() {
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // method name: displayUSFLAG displays flag USA
    public static void displayUSaFlag(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}




