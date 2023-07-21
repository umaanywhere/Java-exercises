class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        // Apply withdrawal fee for savings account
        double fee = 0.02 * amount;
        super.withdraw(amount + fee);
    }
}

class CheckingAccount extends BankAccount {
    private int transactionLimit;

    public CheckingAccount(String accountNumber, double balance, int transactionLimit) {
        super(accountNumber, balance);
        this.transactionLimit = transactionLimit;
    }

    @Override
    public void withdraw(double amount) {
        // Check transaction limit for checking account
        if (transactionLimit > 0) {
            super.withdraw(amount);
            transactionLimit--;
        } else {
            System.out.println("Transaction limit exceeded");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 5000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("CA001", 3000, 3);

        savingsAccount.withdraw(1000);
        checkingAccount.withdraw(2000);

        savingsAccount.deposit(500);
        checkingAccount.deposit(1000);
    }
}