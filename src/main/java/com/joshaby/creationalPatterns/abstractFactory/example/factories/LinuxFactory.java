package com.joshaby.creationalPatterns.abstractFactory.example.factories;

import com.joshaby.creationalPatterns.abstractFactory.example.buttons.Button;
import com.joshaby.creationalPatterns.abstractFactory.example.buttons.LinuxButton;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.Checkbox;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
