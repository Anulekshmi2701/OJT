public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) { 
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(3000);
        account.deposit(800); 
        account.withdraw(300); 
        account.checkBalance(); 
    }
}
