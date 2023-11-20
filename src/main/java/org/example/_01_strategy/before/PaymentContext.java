package org.example._01_strategy.before;

import org.example._01_strategy.before.impl.PaymentStrategy;

// Context sınıfı
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void performPayment(int amount) {
        paymentStrategy.pay(amount);
    }
}
