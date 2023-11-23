public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(110, "Albert Dove", 10020.50, 2);
        CurrentAccount ca = new CurrentAccount(108, "Black Rocks", 1500000.41364, 5000000);
        System.out.println("Savings Account:");
        System.out.println("----------------------------------------");
        sa.AccountDetails();
        sa.deposit(500000);
        sa.withdraw(2000);
        System.out.println("========================================");
        System.out.println();
        System.out.println("Current Account:");
        System.out.println("----------------------------------------");
        ca.AccountDetails();
        ca.deposit(1000000);
        ca.withdraw(205000);

    }
}
