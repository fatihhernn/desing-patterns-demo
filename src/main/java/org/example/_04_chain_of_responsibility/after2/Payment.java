package org.example._04_chain_of_responsibility.after2;

// Client sınıfı - Ödeme işlemi
public class Payment {
    private double amount;
    private double accountBalance;
    private double dailyLimit;
    private boolean isCardValid;

    public Payment(double amount, double accountBalance, double dailyLimit, boolean isCardValid) {
        this.amount = amount;
        this.accountBalance = accountBalance;
        this.dailyLimit = dailyLimit;
        this.isCardValid = isCardValid;
    }

    public double getAmount() {
        return amount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public boolean isCardValid() {
        return isCardValid;
    }
}
