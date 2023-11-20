package org.example._03_observer.after;

// Müşteri sınıfı - Gözlemci
class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(double newBalance) {
        System.out.println(name + " notified. New balance: " + newBalance);
    }
}
