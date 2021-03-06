package day51_inheritance;

public class Employee extends Object{
    public Employee(double min){
        System.out.println(min + " is passing");
    }

    String jobTitle;
    public double calculateSalary(double hourlyRate){
         double salary = hourlyRate * 2080 * 1.1;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
