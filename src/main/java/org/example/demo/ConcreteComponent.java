package org.example.demo;

public class ConcreteComponent extends Component {
    @Override
    public void operator() {
        System.out.println("doSomething");
    }
}
