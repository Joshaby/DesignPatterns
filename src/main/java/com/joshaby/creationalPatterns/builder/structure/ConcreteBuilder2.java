package com.joshaby.creationalPatterns.builder.structure;

public class ConcreteBuilder2 implements Builder {

    private Product2 product2 = new Product2();

    @Override
    public void reset() {
        product2 = new Product2();
    }

    @Override
    public void buildStepA() {
        product2.setFeatureA("Feature A");
    }

    @Override
    public void buildStepB() {
        product2.setFeatureB("Feature B");
    }

    @Override
    public void buildStepZ() {
        product2.setFeatureZ("Feature Z");
    }

    public Product2 getResult() {
        return product2;
    }
}
