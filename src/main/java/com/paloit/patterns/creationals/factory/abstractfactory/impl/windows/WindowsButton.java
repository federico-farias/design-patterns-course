package com.paloit.patterns.creationals.factory.abstractfactory.impl.windows;

import com.paloit.patterns.creationals.factory.abstractfactory.Button;
import com.paloit.patterns.creationals.factory.abstractfactory.CommandHandler;

import java.util.LinkedList;
import java.util.List;

public class WindowsButton implements Button {

    private List<CommandHandler> handlerList;

    public WindowsButton() {
        this.handlerList = new LinkedList<>();
    }

    @Override
    public void addClickHandler(CommandHandler handler) {
        System.out.println("[Windows] Button");
        handlerList.add(handler);
    }

    public void click() {
        this.handlerList.forEach(handler -> handler.execute(this));
    }

}
