package org.example._04_chain_of_responsibility.before;

// ConcreteHandler sınıfı - Kart geçerliliği kontrolü
class CardValidityHandler implements PaymentHandler {
    @Override
    public void handlePayment(Payment payment) {
        if (payment.isCardValid()) {
            System.out.println("Card validity check successful.");
        } else {
            System.out.println("Invalid card!");
        }
    }
}
