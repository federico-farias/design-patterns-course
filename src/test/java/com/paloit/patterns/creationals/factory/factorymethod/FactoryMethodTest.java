package com.paloit.patterns.creationals.factory.factorymethod;

import com.paloit.patterns.creationals.factory.abstractfactory.*;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void createTest() {
        //System.setProperty("currentSO", "Windows");
        System.setProperty("currentSO", "MacOS");
        UIFactory uiFactory = UIFactoryManager.createFactory();
        Button button = uiFactory.createButton();
        button.addClickHandler(new CommandHandler() {
            @Override
            public void execute(Object obj) {
                System.out.println("Click");
            }
        });

        TextBox textBox = uiFactory.createTextBox();
        textBox.addTypedHandler(new CommandHandler() {
            @Override
            public void execute(Object obj) {
                System.out.println("Typed");
            }
        });

        uiFactory.run();
    }

}
