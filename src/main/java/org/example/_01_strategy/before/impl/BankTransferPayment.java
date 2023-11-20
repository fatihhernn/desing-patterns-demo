package org.example._01_strategy.before.impl;

// Banka Transferi ödeme stratejisi
public class BankTransferPayment implements PaymentStrategy {
    private final String accountNumber;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via bank transfer with account number: " + accountNumber);
    }
}
