 class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
 class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available: ₹" + balance + ", Requested: ₹" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn ₹" + amount + ". Remaining balance: ₹" + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ayushmaan Singh", 1000); // Initial balance: 1000

        account.deposit(500); // Adds ₹500 → balance = 1500

        try {
            account.withdraw(2000); // FAILS → 2000 > 1500 → exception thrown
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }

        try {
            account.withdraw(1000); // SUCCESS → 1000 ≤ 1500 → balance = 500
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
