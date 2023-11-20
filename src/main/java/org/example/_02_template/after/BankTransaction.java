package org.example._02_template.after;

// BankTransaction sınıfı
abstract class BankTransaction {
    // Template method
    public final void executeTransaction(TransactionExecutor executor) {
        authenticateUser();
        executor.execute();
        logTransaction();
    }

    // Soyut metotlar
    protected abstract void authenticateUser();

    protected abstract void logTransaction();
}
