package org.example._01_strategy.after.impl;

@FunctionalInterface
interface PaymentStrategy {
    void pay(int amount);
}
