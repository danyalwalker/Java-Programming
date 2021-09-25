package OfficeHours.Practice.InterviewCodingTasks;


public class PracticeEnum {


//        public static final String Q_A = "A";
//        public static final String DEV = "B";
//        public static final String STAGE = "C";
//        public static final String PROD = "D";



    public static String setUpEnv(Environment env){
       String result = "";
        switch (env){
            case Q_A:
                result += Environment.Q_A;
            case DEV:
                result+= Environment.DEV;
                break;
            default:
                result = "";
        }
        return result;
    }

    public static void main(String[] args) {
        setUpEnv(Environment.Q_A);
        System.out.println("setUpEnv(environment.Q_A) = " + setUpEnv(Environment.Q_A));

        Environment abc = Environment.STAGE;
        System.out.println("abc = " + abc);

        System.out.println("Using for each loop");
        for (Environment index:Environment.values()) {
            System.out.println(index);
        }

    }
}

 enum Environment {
    Q_A,
     DEV,
     STAGE,
     PROD

}
