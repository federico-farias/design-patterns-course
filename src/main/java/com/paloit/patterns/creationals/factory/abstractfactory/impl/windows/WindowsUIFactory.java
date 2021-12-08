package com.paloit.patterns.creationals.factory.abstractfactory.impl.windows;

import com.paloit.patterns.creationals.factory.abstractfactory.Button;
import com.paloit.patterns.creationals.factory.abstractfactory.TextBox;
import com.paloit.patterns.creationals.factory.abstractfactory.UIFactory;

public class WindowsUIFactory implements UIFactory {

    private WindowsButton button;

    private WindowsTextBox textBox;

    @Override
    public Button createButton() {
        return button = new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return textBox = new WindowsTextBox();
    }

    @Override
    public void run() {
        this.textBox.type();
        this.button.click();
    }

}
