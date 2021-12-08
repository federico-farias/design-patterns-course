package com.paloit.patterns.creationals.factory.abstractfactory.impl.windows;

import com.paloit.patterns.creationals.factory.abstractfactory.CommandHandler;
import com.paloit.patterns.creationals.factory.abstractfactory.TextBox;

import java.util.LinkedList;
import java.util.List;

public class WindowsTextBox implements TextBox {

    private List<CommandHandler> handlerList;

    public WindowsTextBox() {
        this.handlerList = new LinkedList<>();
    }

    @Override
    public void addTypedHandler(CommandHandler handler) {
        System.out.println("[Windows] TextBox");
        handlerList.add(handler);
    }

    public void type() {
        this.handlerList.forEach(handler -> handler.execute(this));
    }

}
