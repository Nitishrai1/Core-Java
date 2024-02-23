package classes;
import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into account " + accountNumber);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed: " + account.getAccountNumber());
    }

    public void deposit(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public void withdraw(String accountNumber, double amount) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                acc.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a bank
        Bank bank = new Bank();

        // Adding accounts
        Account acc1 = new Account("001", "John Doe", 1000);
        Account acc2 = new Account("002", "Jane Smith", 2000);
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        // Depositing and withdrawing money
        bank.deposit("001", 500);
        bank.withdraw("002", 100);
    }
}
