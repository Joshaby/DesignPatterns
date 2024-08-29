package com.joshaby.creationalPatterns.abstractFactory.example.factories;

import com.joshaby.creationalPatterns.abstractFactory.example.buttons.Button;
import com.joshaby.creationalPatterns.abstractFactory.example.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
