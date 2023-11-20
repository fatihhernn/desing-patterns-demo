package org.example._05_factory.before;

public class ProductFactory {

    public static Product createProduct(String name){
        return switch (name) {
            case "loan" -> new Loan();
            case "stock" -> new Stock();
            case "bond" -> new Bond();
            default -> throw new RuntimeException("No such product " + name);
        };
    }
}