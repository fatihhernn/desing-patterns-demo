package org.example._04_chain_of_responsibility.after2;

import java.util.function.Consumer;

@FunctionalInterface
public interface PaymentHandler extends Consumer<Payment> {
    // Kendi içinde işleme devam etmek için varsayılan metot
    default PaymentHandler setNextHandler(PaymentHandler nextHandler) {
        return (Payment payment) -> {
            this.accept(payment);
            if (nextHandler != null) {
                nextHandler.accept(payment);
            }
        };
    }
}
