package com.joshaby.creationalPatterns.builder.structure;

public class ConcreteBuilder1 implements Builder {

    private Product1 product1 = new Product1();

    @Override
    public void reset() {
        product1 = new Product1();
    }

    @Override
    public void buildStepA() {
        product1.setFeatureA("Feature A");
    }

    @Override
    public void buildStepB() {
        product1.setFeatureB("Feature B");
    }

    @Override
    public void buildStepZ() {
        product1.setFeatureZ("Feature Z");
    }

    public Product1 getResult() {
        return product1;
    }
}
