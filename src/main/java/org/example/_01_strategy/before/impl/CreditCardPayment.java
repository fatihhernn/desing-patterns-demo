package org.example._01_strategy.before.impl;

// Kredi Kartı ödeme stratejisi
public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via credit card with card number: " + cardNumber);
    }
}
