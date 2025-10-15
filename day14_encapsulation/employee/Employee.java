public class Employee {
    private final String name;
    private final double salary;

    // constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // getter
    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    // setter

    public void displaySalary() {
        System.out.printf("Employee Name: %s%n", getName());
        System.out.printf("Employee Salary: %.1f%n", getSalary());
    }
}
