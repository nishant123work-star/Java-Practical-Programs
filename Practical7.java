// Practical 7: Object Lifecycle, Garbage Collection, and Destructor Reference Exercise

class Demo {
    String name;

    public Demo(String name) {
        this.name = name;
        System.out.println("Object constructed: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object garbage collected: " + name);
    }
}

public class Practical7 {
    public static void main(String[] args) {
        Demo obj1 = new Demo("Object 1");
        Demo obj2 = new Demo("Object 2");

        // Removing reachable references
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}