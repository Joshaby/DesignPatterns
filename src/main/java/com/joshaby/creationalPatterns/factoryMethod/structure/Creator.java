package com.joshaby.creationalPatterns.factoryMethod.structure;

public abstract class Creator {

    public void someOperation() {
        Product p = createProduct();
        System.out.println(p.doStuff());
    }

    public abstract Product createProduct();
}
