package org.example._04_chain_of_responsibility.before;

// ConcreteHandler sınıfı - Günlük limit kontrolü
class DailyLimitHandler implements PaymentHandler {
    private PaymentHandler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        if (payment.getAmount() <= payment.getDailyLimit()) {
            System.out.println("Daily limit check successful.");
            if (nextHandler != null) {
                nextHandler.handlePayment(payment);
            }
        } else {
            System.out.println("Exceeded daily limit!");
        }
    }

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
