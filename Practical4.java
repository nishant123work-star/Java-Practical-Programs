// Practical 4: Method Overloading and Method Overriding

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

class Worker {
    public double calculatePay() {
        return 0.0;
    }
}

class PermanentEmployee extends Worker {
    @Override
    public double calculatePay() {
        return 50000.0;
    }
}

class ContractEmployee extends Worker {
    @Override
    public double calculatePay() {
        return 30000.0;
    }
}

public class Practical4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 ints): " + calc.add(10, 20));
        System.out.println("Sum (3 ints): " + calc.add(10, 20, 30));
        System.out.println("Sum (2 doubles): " + calc.add(10.5, 20.5));

        Worker w1 = new PermanentEmployee();
        Worker w2 = new ContractEmployee();

        System.out.println("Permanent Employee Pay: " + w1.calculatePay());
        System.out.println("Contract Employee Pay: " + w2.calculatePay());
    }
}