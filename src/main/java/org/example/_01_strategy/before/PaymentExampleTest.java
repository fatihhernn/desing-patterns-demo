package org.example._01_strategy.before;

import org.example._01_strategy.before.impl.BankTransferPayment;
import org.example._01_strategy.before.impl.CreditCardPayment;
import org.example._01_strategy.before.impl.PayPalPayment;

public class PaymentExampleTest {
    public static void main(String[] args) {
        // Kredi kartı ile ödeme
        PaymentContext creditCardPayment = new PaymentContext(new CreditCardPayment("1234-5678-9101-1121"));
        creditCardPayment.performPayment(100);

        // PayPal ile ödeme
        PaymentContext payPalPayment = new PaymentContext(new PayPalPayment("john.doe@example.com"));
        payPalPayment.performPayment(150);

        // Banka transferi ile ödeme
        PaymentContext bankTransferPayment = new PaymentContext(new BankTransferPayment("TR123456789012345678901234"));
        bankTransferPayment.performPayment(200);
    }
}

