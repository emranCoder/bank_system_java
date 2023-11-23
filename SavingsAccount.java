public class SavingsAccount extends Account {
    public double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount > 500) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + "Tk successful. New balance: " + balance + "Tk.");
        } else {
            System.out.println("The balance certain limit should be (e.g., 500).");
        }
    }

}