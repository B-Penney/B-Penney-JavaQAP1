public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Constructor with id, name, and initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Get id
    public String getId() {
        return id;
    }

    // Get name
    public String getName() {
        return name;
    }

    // Get balance
    public int getBalance() {
        return balance;
    }

    // Credit - to add money to the account
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Debit - to withdraw money if balance is sufficient
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer money to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.debit(amount); // Deduct from this account
            another.credit(amount); // Credit to another account
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method to represent the Account object as a string
    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
