// Practical 6: Default, Parameterized, and Copy Constructors

class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    public void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("--------------------");
    }
}

public class Practical6 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 450.0);
        Book b3 = new Book(b2);

        System.out.println("=== Initial Objects ===");
        System.out.println("Book 1 (Default Constructor):");
        b1.display();

        System.out.println("Book 2 (Parameterized Constructor):");
        b2.display();

        System.out.println("Book 3 (Copy Constructor):");
        b3.display();

        b3.title = "Advanced Java";
        b3.price = 650.0;

        System.out.println("=== After Modifying Book 3 ===");
        System.out.println("Book 2 (Original Unchanged):");
        b2.display();

        System.out.println("Book 3 (Modified):");
        b3.display();
    }
}