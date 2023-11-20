package org.example._04_chain_of_responsibility.before;

// ConcreteHandler sınıfı - Bakiye kontrolü
class BalanceHandler implements PaymentHandler {
    private PaymentHandler nextHandler;

    @Override
    public void handlePayment(Payment payment) {
        if (payment.getAmount() <= payment.getAccountBalance()) {
            System.out.println("Balance check successful.");
            if (nextHandler != null) {
                nextHandler.handlePayment(payment);
            }
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
