package org.example._05_factory.after;

public class FactoryExampleTest {
    public static void main(String[] args) {
        Product p = ProductFactory.createProduct("loan");
        System.out.println(p);
    }
}
