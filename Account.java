public class Account {
    public int accountNumber;
    public String accountHolder;
    public double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + "Tk successful. New balance: " + balance + "TK.");
        } else {
            System.out.println("You don't have sufficient balance.");
        }
    }

    public void AccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance + "Tk.");
    }
}
