package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee developer = new Employee(20.0);
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60);
        System.out.println("annualDevSalary = " +Math.round(annualDevSalary));

        Contractor sdetContractor = new Contractor();
        double sdetSalary = sdetContractor.calculateSalary(55.0);
        System.out.println(sdetSalary);
        System.out.println(sdetContractor.jobTitle);

        System.out.println(developer.toString());
        System.out.println(sdetContractor);

    }
}
