/**
 * Demonstrates encapsulation and validation for a simple bank account.
 */

public class BankAccount {
    private int acctNum;
    private double balance;

    // constructors
    // public BankAccount(int acctNum, double balance) {
    // this.acctNum = acctNum;
    // this.balance = balance;
    // }

    // getters
    public int getAccountNumber() {
        return this.acctNum;
    }

    public double getBalance() {
        return this.balance;
    }

    // setters
    public void setAccountNumber(int acctNum) {
        this.acctNum = acctNum;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance amount. Balance set to 0 by default");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // methods
    public void displayAccountSummary() {
        System.out.printf("Account Number: %d%n", getAccountNumber());
        System.out.printf("Current Balance: %.1f%n", getBalance());

    }
}
