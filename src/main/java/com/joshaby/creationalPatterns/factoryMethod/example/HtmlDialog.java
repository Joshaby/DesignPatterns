package com.joshaby.creationalPatterns.factoryMethod.example;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
