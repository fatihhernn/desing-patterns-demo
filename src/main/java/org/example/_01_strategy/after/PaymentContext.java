package org.example._01_strategy.after;

import org.example._01_strategy.after.domain.PaymentType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

// Bağlam sınıfı
public class PaymentContext {

    private final Map<PaymentType, Consumer<Integer>> paymentStrategies = new HashMap<>();

    public void addPaymentStrategy(PaymentType paymentType, Consumer<Integer> paymentStrategy) {
        paymentStrategies.put(paymentType, paymentStrategy);
    }

    public void performPayment(PaymentType paymentType, int amount) {
        if (paymentStrategies.containsKey(paymentType)) {
            paymentStrategies.get(paymentType).accept(amount);
        } else {
            System.out.println("Invalid payment type: " + paymentType);
        }
    }
}
