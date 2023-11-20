package org.example._02_template.after;

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
    protected void authenticateUser() {
        System.out.println("Authenticating user for money transfer");
    }

    @Override
    protected void logTransaction() {
        System.out.println("Logging money transfer transaction");
    }

    public void performTransaction() {
        // Lambda ifadesi ile transaction'ın gerçekleştirilmesi
        TransactionExecutor executor = () ->
                System.out.println("Transferring money from " + sourceAccount + " to " + destinationAccount + " amount: " + amount);

        executeTransaction(executor);
    }
}