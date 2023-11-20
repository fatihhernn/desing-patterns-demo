package org.example._03_observer.after;

// Gözlemci arayüzü
@FunctionalInterface
interface Observer {
    void update(double newBalance);
}
