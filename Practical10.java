// Practical 10: Encapsulation Using Getters, Setters, and Validation

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0.0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit failed: Amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Withdrawal failed: Invalid amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------------------");
    }
}

public class Practical10 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Sumit", "SBIN0001234", 5000.0);

        System.out.println("=== Initial Account Details ===");
        acc.displayAccountDetails();

        System.out.println("=== Testing Transactions ===");
        acc.deposit(1500.0);    // Valid deposit
        acc.deposit(-500.0);    // Invalid deposit (negative)

        acc.withdraw(2000.0);   // Valid withdrawal
        acc.withdraw(0.0);      // Invalid withdrawal (zero)
        acc.withdraw(10000.0);  // Invalid withdrawal (greater than balance)

        System.out.println("\n=== Final Account Details ===");
        acc.displayAccountDetails();
    }
}