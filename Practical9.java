// Practical 9: this Keyword, Constructor Chaining, and Static Members

class Employee {
    String name;
    double salary;
    static int employeeCount = 0;

    // No-argument constructor calling parameterized constructor using this()
    public Employee() {
        this("Unknown", 0.0);
    }

    // Parameterized constructor using this.field to distinguish instance fields from parameters
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        employeeCount++; // Incrementing static count
    }

    // Static method to display the count
    public static void displayEmployeeCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }

    public void displayDetails() {
        System.out.println("Name   : " + this.name);
        System.out.println("Salary : " + this.salary);
        System.out.println("--------------------");
    }
}

public class Practical9 {
    public static void main(String[] args) {
        System.out.println("=== Initial Count ===");
        Employee.displayEmployeeCount();

        // Creating multiple objects to demonstrate features
        Employee e1 = new Employee();
        Employee e2 = new Employee("Aman", 45000.0);
        Employee e3 = new Employee("Yash", 55000.0);

        System.out.println("\n=== Employee Details ===");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        System.out.println("=== Final Count ===");
        Employee.displayEmployeeCount();
    }
}