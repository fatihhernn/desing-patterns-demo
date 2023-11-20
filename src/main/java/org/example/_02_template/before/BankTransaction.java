package org.example._02_template.before;

// AbstractClass - Soyut Sınıf
public abstract class BankTransaction {
    // Template method, genel algoritmayı temsil eder
    public final void executeTransaction() {
        authenticateUser();
        execute();
        logTransaction();
    }

    // Algoritmada kullanılacak adımlar, alt sınıflar tarafından uyarlanabilir
    protected abstract void authenticateUser();
    protected abstract void execute();
    protected abstract void logTransaction();
}