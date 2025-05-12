package snacks;

public class ContoBancario {
    // characteristics
    private long accountNumber;
    private double accountBalance;

    // getters and setters
    public long getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // constructor
    public ContoBancario(long accountNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0D; // default
    }

    // method for deposits
    public void deposit(double amount) {
        this.accountBalance += amount;
        this.accountBalance = Math.round(this.accountBalance * 100.0) / 100.0; // to round to 2 decimal places
    }

    // method for withdrawals
    public void withdrawal(double amount) {
        this.accountBalance -= amount;
        this.accountBalance = Math.round(this.accountBalance * 100.0) / 100.0; // to round to 2 decimal places
    }

}
