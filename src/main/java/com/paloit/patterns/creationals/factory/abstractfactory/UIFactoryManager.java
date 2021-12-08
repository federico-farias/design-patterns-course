package com.paloit.patterns.creationals.factory.abstractfactory;

import com.paloit.patterns.creationals.factory.abstractfactory.impl.macos.MacOSUIFactory;
import com.paloit.patterns.creationals.factory.abstractfactory.impl.windows.WindowsUIFactory;

public class UIFactoryManager {

    // Abstract Factory Pattern
    public static UIFactory createFactory() {
        String currentSO = (String) System.getProperty("currentSO");
        if (currentSO.equals("Windows")) {
            return new WindowsUIFactory();
        }
        if (currentSO.equals("MacOS")) {
            return new MacOSUIFactory();
        }
        throw new RuntimeException("No se reconoce ningún sistema operativo");
    }

}
