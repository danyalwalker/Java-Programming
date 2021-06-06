package OfficeHours.Practice.InterviewCodingTasks;

public class FrequencyOfCharacters {

    public static String findFrequency(String str ){
        str = "AAABBCDD";
        String freq = "";

        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;}


                }
            if(!freq.contains(str.charAt(i) + "")){
                freq += "" + str.charAt(i) + count;

            }
        }

        return freq;



    }

    public static void main(String[] args) {
        System.out.println(findFrequency("AAABBCDD"));
    }
}
