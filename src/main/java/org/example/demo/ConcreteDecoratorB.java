package org.example.demo;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void methodB(){
        System.out.println("DecoratorB.methodB");
    }

    @Override
    public void operator() {
        this.methodB();
        super.operator();
    }
}
