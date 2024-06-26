package com.joshaby.creationalPatterns.factoryMethod.structure;

public class Application {

    public static void main(String[] args) {
        Creator creator;

        creator = new ConcreteCreatorA();
        creator.someOperation();

        creator = new ConcreteCreatorB();
        creator.someOperation();
    }
}
