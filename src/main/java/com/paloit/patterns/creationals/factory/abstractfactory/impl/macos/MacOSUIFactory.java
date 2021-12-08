package com.paloit.patterns.creationals.factory.abstractfactory.impl.macos;

import com.paloit.patterns.creationals.factory.abstractfactory.Button;
import com.paloit.patterns.creationals.factory.abstractfactory.TextBox;
import com.paloit.patterns.creationals.factory.abstractfactory.UIFactory;

public class MacOSUIFactory implements UIFactory {

    private MacOSButton button;

    private MacOSTextBox textBox;

    @Override
    public Button createButton() {
        return this.button = new MacOSButton();
    }

    @Override
    public TextBox createTextBox() {
        return this.textBox = new MacOSTextBox();
    }

    @Override
    public void run() {
        this.button.click();
        this.textBox.type();
    }

}
