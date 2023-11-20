package org.example._03_observer.before;

// Kullanım
public class ObserverExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");

        account.addObserver(customer1);
        account.addObserver(customer2);

        // Hesap bakiyesi değiştiğinde gözlemciler (müşteriler) otomatik olarak güncellenir.
        account.setBalance(1000.0);
        account.setBalance(750.0);
    }
}
