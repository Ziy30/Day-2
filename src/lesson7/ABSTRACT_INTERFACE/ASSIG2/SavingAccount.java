package lesson7.ABSTRACT_INTERFACE.ASSIG2;

public class SavingAccount implements BankAccount {
    private double balance;
    private double interestRate;

    public SavingAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

}
