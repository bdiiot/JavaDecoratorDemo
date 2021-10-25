package org.example.demo;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA(){
        System.out.println("DecoratorA.methodA");
    }

    @Override
    public void operator() {
        this.methodA();
        super.operator();
    }
}
