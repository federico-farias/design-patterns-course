package com.paloit.patterns.creationals.factory.abstractfactory;

public interface UIFactory {

    Button createButton();

    TextBox createTextBox();

    void run();

}
