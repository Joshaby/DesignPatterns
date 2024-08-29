package com.joshaby.creationalPatterns.abstractFactory.example.factories;

import com.joshaby.creationalPatterns.abstractFactory.example.buttons.Button;
import com.joshaby.creationalPatterns.abstractFactory.example.buttons.MacOSButton;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.Checkbox;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
