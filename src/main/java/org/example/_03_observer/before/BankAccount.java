package org.example._03_observer.before;

import java.util.ArrayList;
import java.util.List;

// BankaHesabi sınıfı - Gözlenen öğe
class BankAccount {
    private double balance;

    //customers
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
        notifyObservers();
    }

    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(balance);
        }
    }
}
