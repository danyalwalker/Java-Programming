package OfficeHours.Practice_03_02_2021;

 /*
    Create variables and give value related to you:

    - String name
    - byte age
    - char gender
    - boolean student
    - short number of siblings
    - long favorite number
    - int number of seasons in your area
    - double birth date: (month.day)
    - int year
    - String full birthday date with year
    - String favorite quote

    - Print the person information

     */

public class PersonInfo {
    public static void main(String[] args) {

        //Variables without data

        String name, fullBirthDate;
        String favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons;
        double birthDate;
        int year;

        // Assignment of data

        name = "Saim";
        age = 50;
        student = true;
        numberOfSiblings = 5;
        favoriteNumber = 3;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate= "" + birthDate + year;  //3.2.2021

        System.out.println(birthDate + '.');  // 3.2 +46
                //double + char is not concatenation, but addition

        System.out.println("" + birthDate + "." + year);






    }

}
