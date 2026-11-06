// Practical 3: Hybrid and Multiple Inheritance Using Interfaces

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple Inheritance implementation via interfaces
class AllInOnePrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("AllInOnePrinter: Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("AllInOnePrinter: Scanning document...");
    }
}

// Base Class & Derived Class for Hybrid Inheritance
class Machine {
    public void powerOn() {
        System.out.println("Machine is powered ON.");
    }
}

class AdvancedPrinter extends Machine implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("AdvancedPrinter: Printing high-resolution document...");
    }

    @Override
    public void scan() {
        System.out.println("AdvancedPrinter: Scanning high-resolution document...");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        System.out.println("=== MULTIPLE INHERITANCE VIA INTERFACES ===");
        AllInOnePrinter aio = new AllInOnePrinter();
        aio.print();
        aio.scan();

        System.out.println("\n=== HYBRID INHERITANCE ===");
        AdvancedPrinter adv = new AdvancedPrinter();
        adv.powerOn();
        adv.print();
        adv.scan();
    }
}
