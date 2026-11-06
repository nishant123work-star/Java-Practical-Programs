// Practical 1: Classes and Objects

class Student {
    // Instance Variables
    private int rollNo;
    private String name;
    private double mark1, mark2, mark3;

    // Constructor
    public Student(int rollNo, String name, double mark1, double mark2, double mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    // Methods
    public double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    public void displayDetails() {
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Name       : " + name);
        System.out.println("Marks      : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateTotal() + "/300");
        System.out.printf("Percentage : %.2f%%\n", calculatePercentage());
        System.out.println("----------------------------------------");
    }
}

public class Practical1 {
    public static void main(String[] args) {
        // Objects Creation
        Student s1 = new Student(101, "Alice Smith", 85.5, 90.0, 88.0);
        Student s2 = new Student(102, "Bob Johnson", 78.0, 82.5, 80.0);
        Student s3 = new Student(103, "Charlie Brown", 92.0, 95.5, 94.0);

        System.out.println("=== STUDENT DETAILS ===");
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
