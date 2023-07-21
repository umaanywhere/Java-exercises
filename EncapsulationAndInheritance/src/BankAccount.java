public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    // Constructor
    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    // Getter and setter methods for accessing private fields
    public String getAccountNumber() {

        return accountNumber;
    }

    public double getBalance() {

        return balance;
    }

    public String getOwnerName() {

        return ownerName;
    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        }
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Owner name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0);
    }
}