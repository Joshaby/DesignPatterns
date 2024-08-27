package com.joshaby.creationalPatterns.factoryMethod.example;

public class LinuxDialog extends Dialog {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }
}
