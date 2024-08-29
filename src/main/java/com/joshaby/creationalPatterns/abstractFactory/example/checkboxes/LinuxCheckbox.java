package com.joshaby.creationalPatterns.abstractFactory.example.checkboxes;

public class LinuxCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created LinuxCheckbox");
    }
}
