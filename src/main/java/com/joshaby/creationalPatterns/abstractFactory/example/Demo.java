package com.joshaby.creationalPatterns.abstractFactory.example;

import com.joshaby.creationalPatterns.abstractFactory.example.app.Application;
import com.joshaby.creationalPatterns.abstractFactory.example.factories.GUIFactory;
import com.joshaby.creationalPatterns.abstractFactory.example.factories.LinuxFactory;
import com.joshaby.creationalPatterns.abstractFactory.example.factories.MacOSFactory;

public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    public static Application configureApplication() {

        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("linux")) {
            factory = new LinuxFactory();
        } else {
            factory = new MacOSFactory();
        }
        return new Application(factory);
    }
}
