package org.example._01_strategy.after;

import org.example._01_strategy.after.domain.PaymentType;

public class PaymentExampleTest {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Kredi Kartı ile ödeme stratejisi
        paymentContext.addPaymentStrategy(PaymentType.CREDIT_CARD, amount ->
                System.out.println("Paid " + amount + " via credit card"));

        // PayPal ile ödeme stratejisi
        paymentContext.addPaymentStrategy(PaymentType.PAYPAL, amount ->
                System.out.println("Paid " + amount + " via PayPal"));

        // Banka Transferi ile ödeme stratejisi
        paymentContext.addPaymentStrategy(PaymentType.BANK_TRANSFER, amount ->
                System.out.println("Paid " + amount + " via bank transfer"));

        // Ödemeler gerçekleştir
        paymentContext.performPayment(PaymentType.CREDIT_CARD, 100);
        paymentContext.performPayment(PaymentType.PAYPAL, 150);
        paymentContext.performPayment(PaymentType.BANK_TRANSFER, 200);
        paymentContext.performPayment(PaymentType.valueOf("CASH"), 50); // Geçersiz ödeme tipi
    }
}
