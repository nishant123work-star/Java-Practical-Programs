// Practical 8: Constructor Overloading.

class Product {
    String productName;
    double price;
    int quantity;

    public Product() {
        this.productName = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1;
    }

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Cost   : " + calculateTotalCost());
        System.out.println("------------------------------------");
    }
}

public class Practical8 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Notebook");
        Product p3 = new Product("Pen", 25.5);
        Product p4 = new Product("Textbook", 450.0, 3);

        System.out.println("=== Constructor Overloading Output ===\n");
        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}