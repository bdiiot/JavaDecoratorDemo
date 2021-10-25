package org.example.demo;

public class DecoratorClient {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // First Decorator
        component = new ConcreteDecoratorA(component);
        // Double Decorator
        component = new ConcreteDecoratorB(component);
        // Run after Decorator
        component.operator();
    }
}
