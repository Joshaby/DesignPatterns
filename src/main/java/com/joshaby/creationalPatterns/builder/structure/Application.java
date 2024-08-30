package com.joshaby.creationalPatterns.builder.structure;

public class Application {

    public static void main(String[] args) {
        ConcreteBuilder1 builder = new ConcreteBuilder1();
        Director director = new Director(builder);
        director.make("simple");
        System.out.println(builder.getResult());
    }
}
