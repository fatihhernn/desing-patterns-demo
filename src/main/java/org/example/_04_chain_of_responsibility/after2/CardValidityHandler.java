package org.example._04_chain_of_responsibility.after2;

// ConcreteHandler sınıfı - Kart geçerliliği kontrolü
public class CardValidityHandler implements PaymentHandler {
    @Override
    public void accept(Payment payment) {
        if (payment.isCardValid()) {
            System.out.println("Card validity check successful.");
        } else {
            System.out.println("Invalid card!");
        }
    }
}
