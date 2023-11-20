package org.example._04_chain_of_responsibility.after2;


// Kullanım
public class LambdaChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Chain oluşturuluyor

        PaymentHandler paymentHandlerChain = new BalanceHandler()
                .setNextHandler(new DailyLimitHandler())
                .setNextHandler(new CardValidityHandler());

        // Ödeme işlemi oluşturuluyor
        Payment payment = new Payment(200.0, 300.0, 500.0, true);

        // Ödeme işlemi zincire iletiliyor
        paymentHandlerChain.accept(payment);
    }
}
