package lesson7.ABSTRACT_INTERFACE.ASSIG12;

import java.util.List;

public interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

    void transfer(BankAccount destination, double amount);

    List<String> getTransactionHistory();
}
