package org.example._02_template.before;

// ConcreteClass - Somut Sınıf
public class TransferMoneyTransaction extends BankTransaction {
    private String sourceAccount;
    private String destinationAccount;
    private double amount;

    public TransferMoneyTransaction(String sourceAccount, String destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    // Alt sınıflar, soyut sınıftaki adımları uyarlar
    @Override
    public void authenticateUser() {
        System.out.println("Authenticating user for money transfer");
    }

    @Override
    public void execute() {
        System.out.println("Transferring money from " + sourceAccount + " to " + destinationAccount + " amount: " + amount);
    }

    @Override
    protected void logTransaction() {
        System.out.println("Logging money transfer transaction");
    }
}
