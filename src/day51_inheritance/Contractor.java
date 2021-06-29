package day51_inheritance;

public class Contractor extends Employee{

public Contractor(){
    super(10.0);
    super.calculateSalary(10.0);
}
    @Override
    public double calculateSalary(double hourlyRate){
        return 50*40*hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
