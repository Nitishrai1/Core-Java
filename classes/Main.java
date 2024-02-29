// class Account {
//     String accountNumber;
//     double balance;
//     public Account(String accountNumber, double balance) {
//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }
//     public String getAccountNumber() {
//         return accountNumber;
//     }
//     public String getAccountHolder() {
//         return accountHolder;
//     }
//     public double getBalance() {
//         return balance;
//     }
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: " + amount);
//             System.out.println("New Balance: " + balance);
//         } else {
//             System.out.println("Invalid deposit amount.");
//         }
//     }
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawn: " + amount);
//             System.out.println("New Balance: " + balance);
//         } else {
//             System.out.println("Invalid withdrawal amount or insufficient funds.");
//         }
//     }
// }
// class Bank {
//     Account[] accounts;
//     int numAccounts;

//     public Bank(int num) {
//         this.accounts = new Account[num];
//         this.numAccounts = 0;
//     }
//     public void addAccount(Account account) {
//         if (numAccounts < accounts.length) {
//             accounts[numAccounts] = account;
//             numAccounts++;
//             System.out.println("Account added: " + account.getAccountNumber());
//         } else {
//             System.out.println("Bank is full. Cannot add more accounts.");
//         }
//     }
//     public void removeAccount(String accountNumber) {
//         for (int i = 0; i < numAccounts; i++) {
//             if (accounts[i].getAccountNumber().equals(accountNumber)) {
//                 accounts[i] = accounts[numAccounts - 1];
//                 accounts[numAccounts - 1] = null;
//                 numAccounts--;
//                 System.out.println("Account removed: " + accountNumber);
//                 return;
//             }
//         }
//         System.out.println("Account not found with number: " + accountNumber);
//     }
//     public Account findAccount(String accountNumber) {
//         for (int i = 0; i < numAccounts; i++) {
//             if (accounts[i].getAccountNumber().equals(accountNumber)) {
//                 return accounts[i];
//             }
//         }
//         return null;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Bank bank = new Bank(10);
//         Account account1 = new Account("001", "John Doe", 1000.0);
//         Account account2 = new Account("002", "Jane Doe", 1500.0);
//         bank.addAccount(account1);
//         bank.addAccount(account2);
//         Account foundAccount = bank.findAccount("001");
//         if (foundAccount != null) {
//             foundAccount.deposit(500.0);
//             foundAccount.withdraw(200.0);
//         }
//         bank.removeAccount("001");
//     }
// }