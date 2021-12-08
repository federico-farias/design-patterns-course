package com.paloit.patterns.creationals.factory.abstractfactory;

@FunctionalInterface
public interface CommandHandler {

    void execute(Object obj);

}
