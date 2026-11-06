// Practical 5: Simulating Operator Overloading Using Methods in Java.

class Complex {
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    public void display() {
        if (imag >= 0) {
            System.out.println(real + " + " + imag + "i");
        } else {
            System.out.println(real + " - " + (-imag) + "i");
        }
    }
}

public class Practical5 {
    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 2.5);
        Complex c2 = new Complex(1.5, 4.0);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        Complex result = c1.add(c2);

        System.out.print("Sum: ");
        result.display();
    }
}