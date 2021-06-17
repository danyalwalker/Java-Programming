package day54_abstraction;

public abstract  class Student {
    String language = "German";
    public void code(String language){
        System.out.println("Student is coding using coding " + language);
    }

    public abstract void attendClass();
}
