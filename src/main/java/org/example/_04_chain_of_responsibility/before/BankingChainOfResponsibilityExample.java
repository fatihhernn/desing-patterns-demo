package org.example._04_chain_of_responsibility.before;

// Kullanım
public class BankingChainOfResponsibilityExample {
    public static void main(String[] args) {
        // Chain oluşturuluyor
        BalanceHandler balanceHandler = new BalanceHandler();
        DailyLimitHandler dailyLimitHandler = new DailyLimitHandler();
        CardValidityHandler cardValidityHandler = new CardValidityHandler();

        balanceHandler.setNextHandler(dailyLimitHandler);
        dailyLimitHandler.setNextHandler(cardValidityHandler);

        // Ödeme işlemi oluşturuluyor
        Payment payment = new Payment(200.0, 300.0, 500.0, true);

        // Ödeme işlemi zincire iletiliyor
        balanceHandler.handlePayment(payment);
    }
}
