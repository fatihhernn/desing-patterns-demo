package org.example._02_template.after;

import org.example._02_template.before.TransferMoneyTransaction;

// Kullanım
public class BankingTemplateMethodTest {
    public static void main(String[] args) {

        TransferMoneyTransaction moneyTransfer =
                new TransferMoneyTransaction("123456", "789012", 500.0);
        moneyTransfer.execute();

    }
}
