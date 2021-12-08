package com.paloit.patterns.creationals.factory.abstractfactory.impl.macos;

import com.paloit.patterns.creationals.factory.abstractfactory.Button;
import com.paloit.patterns.creationals.factory.abstractfactory.CommandHandler;

import java.util.LinkedList;
import java.util.List;

public class MacOSButton implements Button {

    private List<CommandHandler> handlerList;

    public MacOSButton() {
        handlerList = new LinkedList<>();
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
