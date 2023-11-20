package org.example._01_strategy.after.impl;

// Kredi Kartı ödeme stratejisi
class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via credit card with card number: " + cardNumber);
    }
}
