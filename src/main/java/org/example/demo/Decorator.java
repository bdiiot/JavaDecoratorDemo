package org.example.demo;

public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operator() {
        this.component.operator();
    }
}
