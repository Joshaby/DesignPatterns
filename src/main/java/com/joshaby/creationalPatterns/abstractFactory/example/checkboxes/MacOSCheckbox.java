package com.joshaby.creationalPatterns.abstractFactory.example.checkboxes;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Yout have created MacOSCheckbox");
    }
}
