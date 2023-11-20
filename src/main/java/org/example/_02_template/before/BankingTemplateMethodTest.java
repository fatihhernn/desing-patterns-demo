package org.example._02_template.before;

// Kullanım
public class BankingTemplateMethodTest {
    public static void main(String[] args) {
        BankTransaction moneyTransfer = new TransferMoneyTransaction("123456", "789012", 500.0);
        moneyTransfer.executeTransaction();
    }
}
