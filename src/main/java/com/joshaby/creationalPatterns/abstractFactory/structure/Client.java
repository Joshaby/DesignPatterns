package com.joshaby.creationalPatterns.abstractFactory.structure;

public class Client {

    private AbstractFactory abstractFactory;

    public Client(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void someOperation() {
        AbstractProductA abstractProductA = abstractFactory.createProductA();
        System.out.println(abstractProductA.getName());

        AbstractProductB abstractProductB = abstractFactory.createProductB();
        System.out.println(abstractProductB.getName());
    }
}
