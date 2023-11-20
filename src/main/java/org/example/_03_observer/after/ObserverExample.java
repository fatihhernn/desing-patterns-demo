package org.example._03_observer.after;

// Kullanım
public class ObserverExample {

    /**
     * Bu örnekte, BankAccount sınıfı, gözlenen öğeyi temsil eder ve
     * Observer arayüzü ile müşterileri temsil eden Customer sınıfı gözlemcileri temsil eder.
     * Hesap bakiyesindeki değişiklikleri takip etmek için müşteriler gözlemci olarak eklenir
     * ve herhangi bir para yatırma veya çekme işlemi yapıldığında gözlemciler güncellenir.
     * @param args
     */

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

       // Customer customer1 = new Customer("John");
       // Customer customer2 = new Customer("Alice");

        // Lambda ifadeleri ile gözlemcileri (observers) oluşturmak
        Observer customer1 = newBalance -> System.out.println("Customer 1 notified. New balance: " + newBalance);
        Observer customer2 = newBalance -> System.out.println("Customer 2 notified. New balance: " + newBalance);


        account.addObserver(customer1);
        account.addObserver(customer2);

        // Hesap bakiyesi değiştiğinde gözlemciler (müşteriler) otomatik olarak güncellenir.
        account.setBalance(1000.0);

        account.deposit(100);

        account.withdraw(250);
    }
}
