package Bai2_5;

public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid credit amount");
        }
    }

    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid debit amount or insufficient balance");
        }
    }

    public void transferTo(Account another, double amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            System.out.println("Invalid transfer amount or insufficient balance");
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

}
