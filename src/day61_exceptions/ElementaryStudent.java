package day61_exceptions;

public class ElementaryStudent {
    private String name;
    private int age;
    public ElementaryStudent(){}
    public ElementaryStudent(String name, int age) {
       setName(name);
       setAge(age);
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name can not be empty or null");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 12) {
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
