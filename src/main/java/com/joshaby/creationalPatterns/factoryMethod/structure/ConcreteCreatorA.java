package com.joshaby.creationalPatterns.factoryMethod.structure;

public class ConcreteCreatorA extends Creator {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
