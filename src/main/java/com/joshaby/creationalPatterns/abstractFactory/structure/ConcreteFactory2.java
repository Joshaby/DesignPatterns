package com.joshaby.creationalPatterns.abstractFactory.structure;

public class ConcreteFactory2 implements AbstractFactory {
    
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
