package com.joshaby.creationalPatterns.abstractFactory.structure;

public class Application {

    public static void main(String[] args) {
        Client clientForFactory1 = new Client(new ConcreteFactory1());
        clientForFactory1.someOperation();

        Client clientForFactory2 = new Client(new ConcreteFactory2());
        clientForFactory2.someOperation();
    }
}
