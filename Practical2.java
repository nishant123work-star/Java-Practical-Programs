// Practical 2: Inheritance Structures

// 1. Single Inheritance: Vehicle -> Car
class Vehicle {
    protected String brand = "Toyota";
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {
    private String model = "Camry";
    public void displayCarDetails() {
        System.out.println("Single Inheritance -> Brand: " + brand + ", Model: " + model);
    }
}

// 2. Multilevel Inheritance: Person -> Employee -> Manager
class Person {
    protected String name = "John Doe";
}

class Employee extends Person {
    protected int empId = 5001;
}

class Manager extends Employee {
    private String department = "IT Operations";
    public void displayManagerDetails() {
        System.out.println("Multilevel Inheritance -> Name: " + name + ", ID: " + empId + ", Dept: " + department);
    }
}

// 3. Hierarchical Inheritance: Shape -> Circle, Rectangle
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    private double radius = 5.0;
    public void area() {
        System.out.println("Hierarchical Inheritance (Circle Area): " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    private double length = 4.0, width = 6.0;
    public void area() {
        System.out.println("Hierarchical Inheritance (Rectangle Area): " + (length * width));
    }
}

public class Practical2 {
    public static void main(String[] args) {
        System.out.println("=== 1. SINGLE INHERITANCE ===");
        Car car = new Car();
        car.startEngine();
        car.displayCarDetails();

        System.out.println("\n=== 2. MULTILEVEL INHERITANCE ===");
        Manager mgr = new Manager();
        mgr.displayManagerDetails();

        System.out.println("\n=== 3. HIERARCHICAL INHERITANCE ===");
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        c.area();
        r.draw();
        r.area();
    }
}
