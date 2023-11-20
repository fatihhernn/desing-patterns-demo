package org.example._04_chain_of_responsibility.after2;

// ConcreteHandler sınıfı - Bakiye kontrolü
public class BalanceHandler implements PaymentHandler {
    @Override
    public void accept(Payment payment) {
        if (payment.getAmount() <= payment.getAccountBalance()) {
            System.out.println("Balance check successful.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
