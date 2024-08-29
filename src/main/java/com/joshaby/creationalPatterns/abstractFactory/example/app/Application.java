package com.joshaby.creationalPatterns.abstractFactory.example.app;

import com.joshaby.creationalPatterns.abstractFactory.example.buttons.Button;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.Checkbox;
import com.joshaby.creationalPatterns.abstractFactory.example.factories.GUIFactory;

public class Application {

    private Button button;

    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
