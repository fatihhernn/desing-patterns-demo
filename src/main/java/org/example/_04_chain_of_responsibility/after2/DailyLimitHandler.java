package org.example._04_chain_of_responsibility.after2;

// ConcreteHandler sınıfı - Günlük limit kontrolü
public class DailyLimitHandler implements PaymentHandler {
    @Override
    public void accept(Payment payment) {
        if (payment.getAmount() <= payment.getDailyLimit()) {
            System.out.println("Daily limit check successful.");
        } else {
            System.out.println("Exceeded daily limit!");
        }
    }
}
