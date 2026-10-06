class BankAccount {

    // Private state cannot be modified directly from outside
    private double balance;

    public BankAccount(double balance) {

        // Validate initial state
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // Controlled way of changing balance
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
        }
    }

    // Validate before allowing withdrawal
    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Read-only access to balance
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println(account.getBalance());

        // ERROR because balance is private
        // account.balance = -5000;
    }
}