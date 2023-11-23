public class CurrentAccount extends Account {
    public double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance, int overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {

        if ((overdraftLimit + balance) >= amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal of " + amount + "Tk successful. New balance: " + balance);
            } else {
                balance = 0;
                overdraftLimit -= amount - balance;
                System.out.println("Withdrawal of " + amount + "TK successful. New balance: " + balance +
                        "Tk. Overdraft limit remaining: " + overdraftLimit + "Tk.");
            }
        } else {
            System.out.println("You don't have sufficient balance.");
        }
    }
}